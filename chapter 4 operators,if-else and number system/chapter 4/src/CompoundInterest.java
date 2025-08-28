import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your principle amount interest in Rs: ");
        int Principle = input.nextInt();
        System.out.print("Tell me for how many years you are borrowing this money: ");
        double years = input.nextDouble();
        System.out.print("Please enter your rate of interest: ");
        double rate = input.nextDouble();

        double CompInt = Principle * Math.pow((1 + rate/100) , years);
        System.out.println("Your compound interest is Rs: " + CompInt);
    }
}
