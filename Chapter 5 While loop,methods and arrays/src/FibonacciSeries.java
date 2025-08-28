import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number up to which you have to print fibonacci series: ");
        int num = input.nextInt();
        System.out.print("The fibonacci series : ");
        Fibonacci(num);


    }
    public static void Fibonacci(int num){
        if(num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");


        int first = 0 , second = 1;
        while ((first + second <= num)){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }


}
