import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Number guessing game\n");
        int number = 30;
        int num;
        do {
            System.out.print("Enter your guessed number between 1 to 100: ");
            num = input.nextInt();
        }while(number != num);
        System.out.println("Your guess is correct");

    }
}
