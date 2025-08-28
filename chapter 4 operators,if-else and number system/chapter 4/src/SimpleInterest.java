import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner Interest = new Scanner(System.in);
        System.out.print("Enter your principle amount interest in Rs: ");
        int Principle = Interest.nextInt();
        System.out.print("Tell me for how many years you are borrowing this money: ");
        double years = Interest.nextDouble();
        System.out.print("Please enter your rate of interest: ");
        double rate = Interest.nextDouble();
        double interest = (Principle * rate * years)/100;
        System.out.print("\nYour simple interest is Rs: " + interest);

    }
}
