import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Prime number check: ");
        int n = input.nextInt();
        System.out.println(isPrime(n));
    }
    public static boolean isPrime (int num) {
        boolean check = true;
        int j = 2;
        if (num <= 1) {
            check = false;
        } while(j <= num / 2) {
            if (num % j != 0) {
            } else { check = false;
            }
            j++;
        }
        return check;

    }
}
