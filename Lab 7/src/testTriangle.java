import java.util.Scanner;
public class testTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3 sides:");
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        double sideC = input.nextDouble();

        System.out.println("Enter color: ");
        String color = input.next();

        System.out.println("Is the triangle filled? (T/F)");
        boolean isFilled = input.nextBoolean();

        Triangle triangle = new Triangle(sideA,sideB,sideC,color,isFilled);
        System.out.println(triangle);
    }
}
