class StopWatch {
    public long startTime;
    public long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

//Sample test below

import java.util.Scanner;
public class test_StopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch sw = new StopWatch(); //class=stopwatch + object=sw

        System.out.println("Enter the number of times you want the loop to run (integer)");
        int n = input.nextInt();
        System.out.println("The loop will run " + n + " times.");

        sw.start();//starts stop watch
        for (int i = 0; i < n; i++) //loop size based on user input
        sw.stop();//ends stop watch

        System.out.print("The loop took " + sw.getElapsedTime() + " nanoseconds to complete."); //get method
    }
}
