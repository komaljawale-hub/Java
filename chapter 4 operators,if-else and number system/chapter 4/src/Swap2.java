import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        Scanner Swap = new Scanner(System.in);
        System.out.print("Enter first number A: ");
        int a = Swap.nextInt();
        System.out.print("Enter second number B: ");
        int b = Swap.nextInt();
        System.out.println("Swapping is done....");

        int c = a;
        a = b;
        b = c;
        System.out.println("Value of A is: " +a);
        System.out.println("Value of B is: " +b);

    }
}
