import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a,b,and c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double comp = QuadraticCalc(a,b,c);
        System.out.println("The quadratic " + comp);
    }
    public static double QuadraticCalc (double a, double b, double c){
        double x = ((Math.sqrt(Math.pow(b,2) - (4*a*c))) - b) / (2*a);
        return x;
    }
}
