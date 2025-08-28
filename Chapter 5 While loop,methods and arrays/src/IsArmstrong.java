import java.util.Scanner;

public class IsArmstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to know number is Armstrong or not");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        System.out.println(isArmstrong);
        if (isArmstrong) {
            System.out.println("Given number is an armstrong");
        } else {
            System.out.println("Given number is not an armstrong");
        }
    }
    public static boolean isArmstrong ( int num){
        int noOfDigits = noOfDigits(num);
        int finalNumber = 0;
        int numCopy =num;
        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit , noOfDigits);
        }
        System.out.println("final number is " + finalNumber);
        return finalNumber == numCopy;


    }
    public static int pow(int num1 , int num2){
            int result = 1;
            int i = 0;
            while (i < num2){
                result *= num1 ;
                i++;
            }
        System.out.println("power of number is " + result);
            return result;
    }
    public static int noOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        System.out.println("no of digits is " + digits);
        return digits;
    }


}
