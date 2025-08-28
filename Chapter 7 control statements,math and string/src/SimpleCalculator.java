import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your calculator\n");
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the first number: ");
        int num2 = input.nextInt();
        System.out.print("Please enter the operation: ");
        String operation = input.next();


        int result = switch(operation){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1/ num2;
            case "%" -> num1% num2;
            default -> -1;
        };
        System.out.print("Your answer is: " + result);
    }
}
