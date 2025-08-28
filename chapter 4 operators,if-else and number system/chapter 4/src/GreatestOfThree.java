import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner Numbers = new Scanner(System.in);
        System.out.println("Comparing numbers to obtain greatest number\n ");
        System.out.println("Enter three numbers:  ");
        double a = Numbers.nextDouble();
        double b = Numbers.nextDouble();
        double c = Numbers.nextDouble();

        if (a >= b && a >= c){
            System.out.println("The greatest number is: " + a);
        } else if (b >= c) {
            System.out.println("The greatest number is: " + b);
        }else {
            System.out.println("The greatest number is: " + c);
        }
    }
}
