import java.util.Scanner;
public class Exercise5 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a hex number");
        String hex = input.next ();
        //uppercase needed to evaluate hex digits A-F
        int d = hex2Dec (hex.toUpperCase ());
        System.out.println ("The decimal value is: " + d);
    }


    public static int hex2Dec (String h) {
        int dec = 0;
        // run a loop through the string starting at the beginning
        for (int i = 0; i < h.length (); i++) {
            // set char variable to i at each iteration/column
            char hexChar = h.charAt (i);
            // set digit to return each character to an integer -> calls next method
            // <----- after method is called hexChar/digit is equal to [ 0-9 || A-F] and is returned
            int digit = hexChar2Dec (hexChar);
            /*calculation, in the world of hex we work in log 16:
              Hence, set dec equal to 16*dec then add the previous case*/
            dec = dec * 16 + digit;
        }
        return dec;
    }

    public static int hexChar2Dec (char c) {
        /*this method grabs a character-->returns 10-15 based on A-F OR 0-9
        this method is called for the sole purpose of defining
        digit to update the decimal in the previous method*/
        if (c >= 'A' && c <= 'F')
        //runtime i.e. let c = F -> 10 + 15 - 10 == 15 -> return int
            return 10 + c - 'A';
        else
            //runtime i.e. c = 7 -> 7 - 0 = 7 -> return int
            return c - '0';
    }
}
