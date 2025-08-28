import java.util.Scanner;

public class BreakAtExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter the names of student enrolled: ");
            String names = input.next();
            if (names.equals("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited");

    }
}
