import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        System.out.println("Welcome to perimeter calculator\n");
        System.out.println("Enter 4 sides in cms: ");
        Scanner Sides = new Scanner(System.in);
        double A = Sides.nextDouble();
        double B = Sides.nextDouble();
        double C = Sides.nextDouble();
        double D = Sides.nextDouble();

        double perimeter = A+B+C+D;
        System.out.println("perimeter of your rectangle is: " + perimeter + "cm");
    }
}
