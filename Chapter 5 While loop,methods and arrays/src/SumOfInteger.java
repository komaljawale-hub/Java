import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        int sum = AddOfInt(num);
        System.out.println("Sum of your integer is = " + sum);
    }
    public static int AddOfInt(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
            
        }
        return sum;
    }
}
