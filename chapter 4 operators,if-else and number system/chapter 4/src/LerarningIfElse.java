import java.util.Scanner;

public class LerarningIfElse {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        String person = name.nextLine();
        boolean ismale = false;

        if (ismale){
            System.out.println("Welcome Mr. " + person);
        } else {
            System.out.println("Welcome Ms. " + person);
        }

        Scanner input = new Scanner(System.in);
        String Name = input.nextLine();
        boolean isSeniorCitizen = false;
        boolean isAdult = false;
        if (isSeniorCitizen){
            System.out.println("Hello SeniorCitizen");
        } else if (isAdult) {
            System.out.println("Hello Adult");

        }else {
            System.out.println("Hello Child");
        }

    }
}
