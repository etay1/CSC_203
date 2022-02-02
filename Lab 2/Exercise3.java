import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        boolean leap = false;

        if (year % 4 == 0) {
            leap = true;
        } else if (year % 4 == 0 && year % 400 == 0) {
            leap = true;
        } else if (year % 100 == 0) {
            leap = false;
        }

        if (leap)
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is a common year");

    }

}
