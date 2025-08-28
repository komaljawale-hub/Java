import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Have a nice day " + name);
        System.out.print(name + ",Also tell me your age:");
        int age = input.nextInt();
        System.out.println("Okay, Are you interested in internship? ");
        String intro = input.next();
        System.out.println("Great. Thank you " + name);
    }
}
