import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Welcome to study do-while loop\n");
//        System.out.print("Please enter your age: ");
//        int yourAge = age.nextInt();
//        while(yourAge < 0 || yourAge > 120){
//            System.out.print("Please enter your age: ");
//            yourAge = age.nextInt();

//        }
        int yourAge;
        do {
            System.out.print("Please enter your age: ");
            yourAge = age.nextInt();
        }while (yourAge < 0 || yourAge > 120);         // do when while condition is true otherwise go out of the loop
        System.out.println("Your age is " + yourAge);

    }
}
