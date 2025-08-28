import java.util.Scanner;

public class IsPrimeUsingFor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = num.nextInt();
//        if(isPrime(number)){
//            System.out.println("Your number is prime");
//        }else{
//            System.out.println("Your number is not prime");
//        }
        System.out.println("Your number is " + (isPrime(number) ? "Prime" : "Not Prime"));
    }
    public static boolean isPrime(int number){
        if(number <= 1){ return false;}
        for(int i = 2; i < number ; i++){
            if(number % i == 0){
                return false;
            }
        }
     return true;
    }
}
