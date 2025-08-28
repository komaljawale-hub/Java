import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the lcm calculator \n");
        System.out.print("please enter the first number: ");
        int first = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int second = input.nextInt();
        int leastMultiple = lcm(first , second);
        System.out.println("LCM is: " + leastMultiple);


    }
    public static int lcm(int first , int second){
        int i = 1;
        while( i <= second){
            int factor = i * first;
            if(factor % second == 0){
                return factor;

            }
            i++;
        }
        return 0;  //unreachable
    }
}
