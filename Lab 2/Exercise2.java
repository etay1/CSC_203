import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int user = input.nextInt();

        if (user % 5 == 0 && user % 2 == 0) {
            System.out.println("HiFive \n HiEven");
        } else if (user % 5 == 0)
            System.out.println("HiFive");
        else if (user % 2 == 0)
            System.out.println("HiEven");
        else
            System.out.println("Neither");

    }
}
