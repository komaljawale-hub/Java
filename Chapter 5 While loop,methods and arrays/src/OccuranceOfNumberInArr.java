import java.util.Scanner;

public class OccuranceOfNumberInArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Occurances\n");
        Scanner input = new Scanner(System.in);
        int[] newArray = ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find: ");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(newArray , num);
        System.out.println("Your element was found " + occurrences + " times in an array");

    }
    public static int noOfOccurrences(int[] newArray , int num){
        int occ = 0;
        int i = 0;
        while (i < newArray.length){
           if(num == newArray[i]){
               occ++;
           }


            i++;
        }
        return occ;

    }
}
