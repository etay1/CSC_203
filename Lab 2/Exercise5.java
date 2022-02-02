import java.util.Scanner;
public class Exercise5 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a hex number");
        String hex = input.next ();
        int d = hex2Dec (hex.toUpperCase ());
        System.out.println ("The decimal value is: " + d);
    }

    public static int hex2Dec (String h) {
        int dec = 0;
        for (int i = 0; i < h.length (); i++) {
            char hexChar = h.charAt (i);
            int digit = hexChar2Dec (hexChar);
            dec = dec * 16 + digit;
        }
        return dec;
    }

    public static int hexChar2Dec (char c) {
        if (c >= 'A' && c <= 'F')
            return 10 + c - 'A';
        else
            return c - '0';
    }
}
