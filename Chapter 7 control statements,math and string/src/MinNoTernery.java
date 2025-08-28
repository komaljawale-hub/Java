import java.util.Scanner;

public class MinNoTernery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding of minimum number portal using ternery operator\n");
        System.out.print("Please enter the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int secondNum = input.nextInt();
        min(firstNum , secondNum);

    }
    public static int min(int firstNum , int secondNum) {


        int smallerNumber = firstNum < secondNum ? firstNum : secondNum;
        System.out.println(smallerNumber + " is the minimum of two numbers");
        return 0;
    }

}
