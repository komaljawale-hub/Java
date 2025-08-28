import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket discount checking calculator ");
        System.out.print("Please tell me your age: ");
        int age = input.nextInt();
        System.out.println("Are you female? (true/false)");
        boolean isfemale = input.nextBoolean();

        if ( age < 5){
            System.out.println("You got 75% discount");
        } else if (isfemale) {
            System.out.println("You got 50% discount");

        } else if (age > 60 && !isfemale) {
            System.out.println("You got 25% discount");
        }else {
            System.out.println("Sorry, no discount is applicable to you");
        }
    }
}
