import java.util.Scanner;

public class TerneryOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the number checker\n");
        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();


//        int greaterNumber;
//        if(num1 > num2){
//            greaterNumber = num1;
//        }else {
//            greaterNumber = num2;
//        }

        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the greater number");
    }
}