import java.util.Scanner;

public class EvenoddTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num = input.nextInt();
        evenOdd(num);


    }
    public static void evenOdd(int num){
        String isEven = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Your number is " + isEven);
    }
}
