import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Enter to the Recursion world!\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        long fact = factorialRecursion(num);
        System.out.println("Factorial of your number is: " + fact);

    }
    public static long factorialRecursion(int num){
        System.out.println("Function called for " + num);      // method 1
        if(num == 1 ){
            return 1;              // Recursion applied and base case is defined
        }
        return num * factorialRecursion(num - 1);
    }


    public static long factorialForLoop(int num){
        int fact = 1;                                             // method 2
        for(int i = 1; i <= num; i++){
         fact *= i;
        }
        return fact;
    }
}
