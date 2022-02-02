import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight (lbs): ");
        double lbs = input.nextDouble();
        System.out.println("Enter height (in): ");
        double inch = input.nextDouble();
        double kilo = lbs * (.45359237);
        double meter = inch * (.0254);
        double bmi = BMI(kilo,meter);
        System.out.println("Your BMI is: " + bmi);
    }
    public static double BMI (double w, double h) {
        double x;
        x = (w / Math.pow(h,2));
        return x;
    }
}
