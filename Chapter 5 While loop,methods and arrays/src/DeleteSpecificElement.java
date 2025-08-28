import java.util.Scanner;

public class DeleteSpecificElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Deleting a specific element form array portal\n");
        int[] myArray = ArrayUtility.inputArray();
        System.out.print("please enter the number you want to delete from your array: ");
        int numToDelete = input.nextInt();
        int[] newArray = deleteNumber(myArray , numToDelete);
        System.out.println("Here is your new array: ");
        ArrayUtility.displayArray(newArray);

    }
    public static int occurrence(int[] myArray , int num){
        int i = 0;
        int occ = 0;
        while (i < myArray.length){
            if(num == myArray[i]){
                occ++;

            }
            i++;
        }
        return occ;
    }
    public static int[] deleteNumber(int[] myArray , int numToDelete){
        int occ = occurrence(myArray , numToDelete);
        if(occ == 0){
            return myArray;
        }
        int newSize = myArray.length - occ;
        int[] newArray = new int [newSize];

        int i = 0 , j = 0;
        while (i < myArray.length){
            if(numToDelete != myArray[i]){
                newArray[j] = myArray[i];
                j++;
            }
            i++;
        }
        return newArray;

    }
}
