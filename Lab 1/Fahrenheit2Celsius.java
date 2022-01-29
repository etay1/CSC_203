import java.util.Scanner;
public class Exercise2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter degrees in Celsius");
        double c = input.nextDouble();
        double f = (c * (9/5)) + 32;
        System.out.println("Fahrenheit conversion is: " + f);
    }
}
