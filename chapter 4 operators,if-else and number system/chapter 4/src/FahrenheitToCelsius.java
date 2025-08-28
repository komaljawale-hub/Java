import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner Temp = new Scanner(System.in);
        System.out.print("please enter temperature in degree fahrenheit: ");
        double F = Temp.nextDouble();

        System.out.println("Converting degree Fahrenheit to degree Celsius... ");
        double Celsius = (F - 32) * 5/9;
        System.out.println("Your temperature in Celsius is: " + Celsius);
    }
}
