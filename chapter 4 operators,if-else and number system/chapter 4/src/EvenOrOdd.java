import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner EvenOdd = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator \n");
        System.out.print("Please, enter your number: ");
        double num = EvenOdd.nextDouble();

        if ( num % 2 == 0 ){
            System.out.println("Your number is even");
        }else {
            System.out.println("Your number is odd");
        }

    }
}
