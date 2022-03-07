public class Exercise1 {
    public static void main(String[] args) {
        print_mul_table();
    }

    public static void print_mul_table() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
/*
Sample Exercise1:
1 2 3 4 5 6 7 8 9 
2 4 6 8 10 12 14 16 18 
3 6 9 12 15 18 21 24 27 
4 8 12 16 20 24 28 32 36 
5 10 15 20 25 30 35 40 45 
6 12 18 24 30 36 42 48 54 
7 14 21 28 35 42 49 56 63 
8 16 24 32 40 48 56 64 72 
9 18 27 36 45 54 63 72 81 
*/

---------------------------------------------------------------------------------------------------

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

---------------------------------------------------------------------------------------------------

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

---------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class Exercise3b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines to print");
        int rows = input.nextInt();
        pyramid(rows);
    }

    public static void pyramid(int n) {
        for (int i = 0;i < n; i++) {
            
            for (int j = 0; j < (n - i); j++) 
                System.out.print(" ");
            
            for (int k = 0; k <= i; k++) 
                System.out.print("* ");
            
            System.out.println("");
        }
    }

}

/*
Sample Exercise3b:
Enter number of lines to print
6
      * 
     * * 
    * * * 
   * * * * 
  * * * * * 
 * * * * * * 
*/

---------------------------------------------------------------------------------------------------

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first phrase");
        String one = input.nextLine();
        System.out.println("Enter second phrase");
        String two = input.nextLine();
        printResult(long_Prefix(one,two));
    }

    public static String long_Prefix(String s1, String s2) {
        String result = "";

        //create a loop that runs for as long as i is shorter than both strings
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            // if the chars of both phrases are equal add to result
            if (s1.toLowerCase().charAt(i) == s2.toLowerCase().charAt(i))
                result += s2.charAt(i);
        }
        return result;
    }

    public static void printResult(String result) { //found this .isEmpty() instead of null (shorter)
        if (result.isEmpty())
            System.out.println("No prefix match");
        else
            System.out.println(result);
    }

}

/*
Sample Exercise4:
Enter first phrase
Bye World
Enter second phrase
bye world
bye world

*/
