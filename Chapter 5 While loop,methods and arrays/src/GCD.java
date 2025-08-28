import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int first = input.nextInt();
        System.out.print("enter the second number: ");
        int second = input.nextInt();
        int gcd = GCD(first , second);
        System.out.println("GCD is: " + gcd);
    }
    public static int GCD(int first , int second){
        int gcd = 1;
        int i = 1;
        int least = least(first , second);
        while (i <= least){
            if(first % i == 0 && second % i == 0){
                gcd = i;
            }
            i++;

        }


        return gcd;


    }
    public static int least(int num1 , int num2){
        if(num1 < num2){
            return num1;
        }else {
            return num2;
        }
    }
}
