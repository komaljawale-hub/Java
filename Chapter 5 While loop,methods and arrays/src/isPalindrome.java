import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to palindrome\n");
        System.out.print("Please enter your number: ");
        int number = input.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if(isPalindrome){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("your number is not palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        return num == Reversed(num);

    }
    public static int Reversed(int num){
        int newNum = 0;
        int digit = 0;
        while (num > 0){
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
