import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number: ");
        int num = input.nextInt();

        int sum = OddSum(num);
        System.out.println("Sum of odd numbers till " + num + " is " + sum);


    }
    public static int OddSum (int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {

            sum = sum + i ;
            i = i + 2;

        }
        return sum;


    }

}
