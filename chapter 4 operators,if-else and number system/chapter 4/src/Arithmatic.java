import java.util.Scanner;

public class Arithmatic {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        Scanner operations = new Scanner(System.in);
        System.out.print("Enter 1st Num: ");
        int A = operations.nextInt();
        System.out.print("Enter 2nd Num: ");
        double B = operations.nextDouble();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
        System.out.println("Further is float numbers multiplication...");
        float x = 4.78f;
        float y = 7.84f;
        System.out.println(x*y);


    }
}
