import java.util.Scanner;

public class MultiplicationTableUsingFor {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number to print its table: ");
        int number = num.nextInt();
        for(int i = 1; i < 11 ; i++ ){
            System.out.println(number + " X " + i + " = " + (i * number));
        }
    }
}
