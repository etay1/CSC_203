import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = (int) (Math.random() * 10);
    int b = (int) (Math.random() * 10);
    boolean add = true;
    boolean sub = true;
    boolean mult = true;

    System.out.println("The numbers are a = " + a + " and b = " + b);
    System.out.println("a + b = ?" );
    int n = input.nextInt();
    if (a + b != n)
        add = false;

    System.out.println("a - b = ? ");
    int n2 = input.nextInt();
    if (a - b != n2)
        sub = false;

    System.out.println("a * b = ?");
    int n1 = input.nextInt();
    if (a * b != n1)
        mult = false;

    System.out.println("Addition answer: " + add);
    System.out.println("Substitution answer: " + sub);
    System.out.println("Multiplication answer: " + mult);

    }
}
