import java.util.Objects;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner pass = new Scanner(System.in);
        String password;
        String ROSE = "ROSE";
        do {
            System.out.print("Enter your password: ");
            password = pass.nextLine();
        }while(!password.equals(ROSE));  // here the thing that ....when while condition is true until then do loop we be executed
        System.out.println("Your Phone is unlocked");

    }
}
