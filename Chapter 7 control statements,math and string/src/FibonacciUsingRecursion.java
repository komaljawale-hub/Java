import java.util.Scanner;

public class FibonacciUsingRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements to be printed: ");
        int count = input.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.print(RecursionFibonacci(i) +  " ");
        }

    }
    public static int RecursionFibonacci(int position){
        if(position == 1){   //these are base cases at position 1 there is element 0
            return 0;
        }
        if(position == 2){
            return 1;
        }
        return RecursionFibonacci(position -1) + (position - 2);

    }
}
