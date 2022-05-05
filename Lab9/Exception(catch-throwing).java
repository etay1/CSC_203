import java.util.Scanner;
public class TryCatchExample1 {
    public static void main(String[] args) {

        //A.) This code below throws an exception when divided by zero
        try {
            int a = 100;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
        //B.)This exception is thrown because we are trying to point to an object
        // that doesn't exist since it's contents are null
        try {
            int arr[] = null;
            System.out.println(arr[0]);
        }
        catch(NullPointerException e) {
            System.out.println("The array is null");
        }

        //C.)The index we are pointing to is out of bounds from the array
        try {
            int arr1[] = {1,2,3};
            System.out.println(arr1[3]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("The index does not exist in the array");
        }

        //D.)We established a requirement for the input if the user doesn't abide
        // it will prompt them that the value they entered was outside the guidelines
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a positive integer less than 100");
            int n = input.nextInt();
            if (n < 1 || n >= 100) {
            throw new IllegalArgumentException();
            }
            System.out.println("Approved!");
        }
        catch (IllegalArgumentException e) {
            System.out.println("The value entered was not a positive integer less than 100");
        }
        //E.)Here we have a class exception
        //This is because we are casting the parent class to the child class
        //If the parent doesn't refer to the specific child then we will get this runtime error
        try {
            Prius prius = new Prius("Blue");
            Car car = new Car("Red");
            car = prius;
            Car.show("My prius");

            Car car1 = new Car("White");
            Prius d = (Prius) car1;
        }
        catch(ClassCastException e) {
            System.out.println("You have got a class cast error!");
        }
        //This is because we are casting the parent class to the child class
        //If the parent doesn't refer to the specific child then we will get this runtime error

    }
}

class Car {
    static String color;
    Car(String color){
        this.color = color;
    }
    void gas (String name) {
        System.out.println("Gas: " + name);
    }
    static void show(String name) {
        System.out.println(name + " is " + color);
    }
}
class Prius extends Car{
    Prius(String color) {
        super(color);
    }
    void gas(String name) {
        System.out.println(name + " using...");
    }
}

/*
Sample Run: 
You can't divide by zero
The array is null
The index does not exist in the array
Enter a positive integer less than 100
4
Approved!
My prius is Red
You have got a class cast error!
*/
