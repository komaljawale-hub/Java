import java.util.Scanner;

public class MaximumValueInArrayForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element number " + (i + 1) + ": ");
            arr[i] = input.nextInt();
            i++;
        }
        maxInteger(arr);
    }
    public static void maxInteger(int[] arr){
        int max = 0;
        for (int num : arr){
            if (max < num){
                max = num;
            }
        }
        System.out.println("\nMaximum value is " + max);
    }
}
