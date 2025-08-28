import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to print table of that number: ");
        int num = input.nextInt();
        int i = 1;
        while (i <= 10) {
            int table = i * num;
            System.out.println(num + "x" + i + "=" + table);
            i++;
        }


    }
}
