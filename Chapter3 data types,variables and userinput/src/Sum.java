import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Welcome to our calculator");
        System.out.print("Please enter the first num: ");
        int firstNum = numbers.nextInt();
        System.out.print("Now, Please enter the second num: ");
        int secondNum = numbers.nextInt();
        int add = firstNum + secondNum;
        System.out.println("add of your numbers is: " + add);


    }

}
