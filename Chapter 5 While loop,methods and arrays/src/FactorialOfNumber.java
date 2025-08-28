import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the factorial calculator\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        long factorial = NumFactorial(num);
        System.out.print("Factorial of your number is: " + factorial);


    }
    public static long NumFactorial(int num){
        if (num < 2){
            return 1;
        }
        long factorial = 1;
        int i = 2;
        while (i <= num){
            factorial = i * factorial;
            i++;
        }
        return factorial;

    }
}
