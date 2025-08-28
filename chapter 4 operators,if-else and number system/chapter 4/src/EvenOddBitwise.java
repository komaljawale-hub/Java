import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        if ((num & 1) == 0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }



    }
}
