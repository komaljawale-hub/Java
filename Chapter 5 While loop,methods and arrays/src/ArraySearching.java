import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = {24, 34, 98, 58, 2, 61, 90, 56, 109, 35};
        System.out.print("Enter the number you want search: ");
        int num = input.nextInt();
        boolean isFound = isFound(myArr , num);
        if(isFound){
            System.out.println("Your number found in array");
        }else{
            System.out.println("Your number not found in array");
        }


    }
    public static boolean isFound(int[] arr , int num){
        int index = 0;
        while (index < arr.length){
            if(arr[index] == num){
                return true;

            }
            index++;
        }
        return false;
    }
}
