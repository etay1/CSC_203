
import java.util.Scanner;
public class Exercise3a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int max = input.nextInt();
        numb_pyramid(max);
    }
    
    public static void numb_pyramid(int n) {
        for (int i = 0; i <= n; i++) { //outer loop (to run n total lines)

            for (int j = 1; j <= i; j++) //first nested loop to print the integers
                System.out.print(j);

            for (int j = 1; j <= (2*(n-i)); j++) //if the current iteration >= twice the complement of n&i
                System.out.print(" "); // then print a spaces -- figuring this one out hurts my brain

            System.out.print(" ");

            for (int j = i;  j > 0; j--) // after printing the spaces we then print the integers in
                System.out.print(j);// descending order until we real 1 (exclude zero)

            System.out.println(""); // then we send it to the next line to print the remainder of n
        }
    }

}

/*
Sample Exercise3a:
1           1
12         21
123       321
1234     4321
12345   54321
123456 654321
*/
