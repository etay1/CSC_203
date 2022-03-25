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
