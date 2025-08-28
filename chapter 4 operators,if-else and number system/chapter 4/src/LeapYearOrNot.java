import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner inputYear = new Scanner(System.in);
        System.out.println("Welcome to know that a year is Leap or Not");
        System.out.print("Please, enter the year: ");
        int year = inputYear.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("It is a leap year");
        } //else if(year % 400 == 0 ) {
            //System.out.println("It is a leap year");
        else {
            System.out.println("it is not a leap year");
        }
    }
}
