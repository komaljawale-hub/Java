import java.util.Scanner;

public class ContinueToSkipNegativeNum {
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
        int sum = 0;
        for(int num : arr){
            if(num < 0){
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of your numbers is " + sum);

    }

}
