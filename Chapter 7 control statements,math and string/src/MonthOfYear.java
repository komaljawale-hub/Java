import java.util.Scanner;

public class MonthOfYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to month mapping\n");
        System.out.print("Enter the month of year in number: ");
        int month = input.nextInt();
        monthOfYear(month);

    }
    public static String monthOfYear(int month){
        String monthOfYear = switch (month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };
        System.out.println("Month of Year is " + monthOfYear);
        return monthOfYear;
    }
}
