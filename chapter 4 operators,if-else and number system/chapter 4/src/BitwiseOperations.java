import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise AND operation");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int result1 = first & second;     //Bitwise AND operation
        System.out.println("Your result is: " + result1);

        System.out.println("Showcasing bitwise OR operation");
        int result2 = first | second;     //Bitwise OR operation
        System.out.println("Your result is: "+ result2);

        System.out.println("Showcasing bitwise XOR operation");
        int result3 = first ^ second;     //Bitwise XOR operation
        System.out.println("Your result is: "+ result3);

        System.out.println("Showcasing bitwise NOT operation");
        System.out.println("Enter a number");
        int a = input.nextInt();
        int compliment = ~ a;
        System.out.println("Complement of your number is: " + compliment);

        System.out.println("Showcasing bitwise leftshift operation");
        System.out.println("Enter a number ");
        int b = input.nextInt();
        int leftshift = b << 2;
        System.out.println("Your left shifted number is: " + leftshift);

        System.out.println("Showcasing bitwise rightshift operation");
        int rightshift = b >> 2;
        System.out.println("Your rightshifted number is: " + rightshift);


    }
}
