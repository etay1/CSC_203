import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        double average = avg(x,y,z);
        System.out.println("The average of the three numbers is " + average);
    }
    public static double avg (double a, double b, double c) {
    double x = (a+b+c) / 3;
    return x;
    }
}
