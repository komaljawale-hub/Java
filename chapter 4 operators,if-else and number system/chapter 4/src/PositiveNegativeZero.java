import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner inputnum = new Scanner(System.in);
        System.out.println("Welcome to know about your number");
        System.out.print("Please, enter your number: ");
        int Num = inputnum.nextInt();

        if (Num > 0 ){
            System.out.println("Your Number is positive.");
        } else if (Num < 0) {
            System.out.println("Your Number is Negative.");
        }else {
            System.out.println("Your Number is Zero.");
        }
    }
}
