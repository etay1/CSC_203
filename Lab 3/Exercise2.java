import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to display n many lines: ");
        int n = input.nextInt();
        pattern(n);
    }

    public static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i;j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

}
/*
Sample Exercise2:
Enter number to display n many lines: 
5
* 
* * 
* * * 
* * * * 
* * * * * 
*/
