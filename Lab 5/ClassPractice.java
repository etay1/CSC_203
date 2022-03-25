public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,40);
        Rectangle rectangle2 = new Rectangle(3.5,35.9);
        System.out.println("Width: " + rectangle1.width + " | Height: " + rectangle1.height + " | Area: " + rectangle1.getArea() + " | Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Width: " + rectangle2.width + " | Height: " + rectangle2.height + " | Area: " + rectangle2.getArea() + " | Perimeter: " + rectangle2.getPerimeter());
    }
}

class Rectangle {
    double width; // data field
    double height; // data field

    Rectangle() { // no arg constructor
        width = 1.0; //not being used
        height = 1.0; //just added due to exercise requirements
    }

    Rectangle(double newWidth, double newHeight) { //specify variables
        width = newWidth;
        height = newHeight;
    }

    double getArea() { //method for area
        return height * width;
    }

    double getPerimeter() { // method for perimeter
        return (2 * width) + (2 * height);
    }

}

/*
Sample Exercise 1: 

Width: 4.0 | Height: 40.0 | Area: 160.0 | Perimeter: 88.0
Width: 3.5 | Height: 35.9 | Area: 125.64999999999999 | Perimeter: 78.8
*/

---------------------------------------------------------------------------------------------------

//Sample for stopwatch class:
import java.util.Scanner;
public class test_StopWatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StopWatch sw = new StopWatch(); //class=stopwatch + object=sw

        System.out.println("Enter the number of times you want the empty loop to run (integer)");
        int n = input.nextInt();

        sw.start();//starts stop watch
        for (int i = 0; i < n; i++) //loop size based on user input
            sw.stop();//ends stop watch

        System.out.print("The loop took " + sw.getElapsedTime() + " milliseconds to complete."); //get method
    }
}

//Exercise 2 assignment requirements:
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
