import java.util.Scanner;

public class SumAvgOfArray {
    public static void main(String[] args) {
        System.out.println("Welcome Array sum and average");
        int[] myArray = ArrayUtility.inputArray();
        long sum = sum(myArray);
        System.out.println("Sum of Array elements is: " + sum);
        double average = Average(myArray);
        System.out.println("Average of array elements is: " + average);


    }
    public static long sum(int[] myArray){
        long sum = 0;
        int i = 0;
        while (i < myArray.length){
            sum = sum + myArray[i];
            i++;
        }
        return sum;
    }
    public static double Average(int[] myArray){
        double sum = sum(myArray);
        double average = (sum/myArray.length);
        return average;
    }
}
