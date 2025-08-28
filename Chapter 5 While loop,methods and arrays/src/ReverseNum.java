import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = input.nextInt();
        int reversed = Reverse(num);
        System.out.println("Your reversed number is " + reversed);
    }
    public static int Reverse(int num){
        int newNum= 0;
        int digit =0;
        while (num > 0){
            digit = num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;

        }
        return newNum;

    }
}
