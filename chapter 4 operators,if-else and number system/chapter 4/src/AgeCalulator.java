import java.util.Scanner;

public class AgeCalulator {
    public static void main(String[] args) {
        Scanner inputAge = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = inputAge.nextInt();

        if (age <13){
            System.out.println("You are a child");
        } else if (age <20) {
            System.out.println("You are a teenager");
        } else if (age < 60) {
            System.out.println("You are an adult");

        }else {
            System.out.println("You are a senior");
        }
    }
}
