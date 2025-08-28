import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int num = 1; // initialization
        while (num <=10) { // condition
            
            System.out.println(num); // actual work
            ++ num; //updating the condition


        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number in between 0 to 200");
        int a = input.nextInt();  // initialization
        while (a > 200){   //condition to print till 200 in descending order
            System.out.println(a);
            a--;    // updating value
        }
    }
}
