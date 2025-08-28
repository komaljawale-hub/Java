import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner Sides = new Scanner(System.in);
        System.out.print("Enter the Height of triangle in cm: ");
        float H = Sides.nextFloat();
        System.out.print("Enter base of triangle in cm: ");
        float B = Sides.nextFloat();
        float AreaOfTriangle = 0.5f*B*H;
        System.out.println("Area of Triangle is: " +AreaOfTriangle + "cm2");

    }
}
