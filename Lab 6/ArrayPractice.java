import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to declare the size of an array");
        int n = input.nextInt();
        System.out.println("Now fill the array with values between 0.0 and 1.0 (inclusive)");
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextDouble();
            while(arr[i] < 0.0 || arr[i] > 1.0) {
                System.out.println("This value is out of bounds, enter a value between 0.0 and 1.0 (inclusive)");
                arr[i] = input.nextDouble();
            }
        }

        double total = findSum(arr);

        System.out.println("Median: " + findMedian(arr));
        System.out.println("Mode: (if none lowest value will print) " + findMode(arr));
        System.out.println("Smallest element: " + findLow(arr));
        System.out.print("Numbers greater than average: ");
        findOutliers(arr,total);
        System.out.println("\nRandom order: Sent you an email regarding this");
        System.out.println("Histogram: Sent you an email regarding this ");

        System.out.println();

        //Question 2
        System.out.println("Enter N: ");
        int N = input.nextInt();
        int[] primes = new int[N];
        for (int i = 0; i < N; i++) {
            if(isPrime(i)&&isPrime(N-i)) {
                System.out.println(i + " + " + (N-i) + " = " + N);
            }
        }
    }

    public static double findMedian(double[] arr) {
            Arrays.sort(arr);
            if (arr.length % 2 != 0)
                return (double)arr[arr.length / 2];
            else
                return (double) (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0;
        }

    public static double findLow(double[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static double findSum(double[] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static void findOutliers(double[] arr, double sum ) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > (sum/arr.length))
                System.out.print(arr[i] +" ");
        }
    }

    public static double findMode(double[] arr) { //via linear traversal
        Arrays.sort(arr);
        int maxCount = 1;
        int currentCount = 1;
        double reserve = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    reserve = arr[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > maxCount) {
            maxCount = currentCount;
            reserve = arr[arr.length-1];
        }

        return reserve;
    }

    public static boolean isPrime (int num) {
        boolean check = true;
        int j = 2;
        if (num <= 1) {
            check = false;
        } while(j <= num / 2) {
            if (num % j != 0) {
                //empty statement to pass true
            } else {
                check = false;
            }
            j++;
        }
        return check;
    }


}






/*
Sample Run: 
Enter an integer to declare the size of an array
6
Now fill the array with values between 0.0 and 1.0 (inclusive)
.3
.5
.4
.2
.3
.1
Median: 0.3
Mode: (if none lowest value will print) 0.3
Smallest element: 0.1
Numbers greater than average: 0.4 0.5 
Random order: Sent you an email regarding this
Histogram: Sent you an email regarding this 

Enter N: 
118
5 + 113 = 118
11 + 107 = 118
17 + 101 = 118
29 + 89 = 118
47 + 71 = 118
59 + 59 = 118
71 + 47 = 118
89 + 29 = 118
101 + 17 = 118
107 + 11 = 118
113 + 5 = 118
*/
