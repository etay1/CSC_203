import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a,b,and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x = ((Math.sqrt(Math.pow(b,2) - (4*a*c))) - b) / (2*a);
        System.out.println("Computation of x is : " + x);
    }
}
