import java.util.Scanner;

public class IfPalindromeUsingPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string you want to check: ");
        String anyName = input.nextLine();
        System.out.println("Your string is " + (isPalindrome(anyName) ? "Palindrome" : "Not Palindrome"));


    }
    public static boolean isPalindrome(String anyName){
        if(anyName.length() <= 1){
            return true;
        }
        int lastPos = anyName.length() - 1;
        if(anyName.charAt(0) != anyName.charAt(lastPos)){
            return false;
        }
        String newString = anyName.substring(1, lastPos);
        return isPalindrome(newString);
    }
}
