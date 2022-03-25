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
