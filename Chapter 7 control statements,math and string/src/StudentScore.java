import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the student score portal\n");
        System.out.print("Enter students's score: ");
        int scores = input.nextInt();

        String category = scores >= 80 ? "High" : (scores >= 50 ? "Moderate" : "Low" );
        System.out.println("Your category is: " + category);
    }
}
