import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Identifying number is prime or not...");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("Given number is a prime number");
        }else {
            System.out.println("Given number is not a prime number");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if(num % i == 0){
                return false;

            }
            i++;
        }
        return true;

    }
}
