import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers: ");
        for (int i : arr) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum: " + sum);
    }
}
/*
Sample Run: 
Enter 10 integers: 
4
1
2
4
5
6
4
2
3
4
Sum: 35
*/
---------------------------------------------------------------------------------------------------
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length;i++)
            arr[i] = input.nextInt();
        System.out.println(displayProduct(arr));
    }

    public static int displayProduct (int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++)
           product*=arr[i];
        return product;
    }

}
/*
Sample Run:
Enter five integers
3
4
5
6
7
2520
*/

---------------------------------------------------------------------------------------------------
//Exercise 3
public class Person {
    String name, address,phone,email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public String toString () {
        return getClass().getName() + "\tName: " + name +
                "\t| Address: " + address +
                "\t| Email: " + email +
                "\t| Phone: " + phone;
    }
}

class Student extends Person {
    //define status as constants
    final int freshman = 1;
    final int sophomore = 2;
    final int junior = 3;
    final int senior = 4;
    String status = "freshman";

    public Student(String name, String address, String phone, String email, int statusConstant) {
        super(name, address, phone, email);
        switch (statusConstant) {
            case 1: status = "Freshman";
            break;
            case 2: status = "Sophomore";
            break;
            case 3: status = "Junior";
            break;
            case 4: status = "Senior";
            break;
        }
    }

    public String toString(){
        return super.toString() + "\t| Status: " + status;
    }
}

class Employee extends Person {
    String office;
    double salary;
    java.util.Date dateHired;

    public Employee (String name, String address, String phone, String email, String office, double salary) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
    }
    public String toString(){
        return super.toString() + "\t| Office: " + office + "\t|Salary: " + salary;
    }

}

class Faculty extends Employee {
    String hours;
    String rank;
    public Faculty (String name, String address, String phone, String email, String office, double salary, String hours, String rank) {
        super(name,address,phone,email, office, salary);
        this.hours = hours;
        this.rank = rank;
    }

    public String toString(){
        return super.toString() + "\t| Office Hours " + hours + "\t|Rank: " + rank;
    }
}

class Staff extends Employee {
    String title;

    public Staff (String name, String address, String phone, String email, String office, double salary, String title) {
        super(name,address,phone,email, office, salary);
        this.title = title;
    }
    public String toString() {
       return super.toString() + "\t|Title: " + title;
    }
}


//Test Class for Exercise 3:
class Test {
    public static void main(String[] args) {
        Person person = new Person("John","1 Monroe Ave", "631-000-1234","dogcat123@yahoo.com");
        Student student = new Student("Bob", "123rd St", "123-456-7890", "cat4321@gmail.com", 4);
        Employee employee = new Employee("Jorge", "45 Gate Ave", "872-131-2312", "greenhornett@outlook.com", "Brown 101", 100000);
        Faculty faculty = new Faculty("Rebecca","304 Bill Ave","631-323-1414","rebecca321@gmail.com", "9:00AM - 12:00PM", 75000, "12:00PM-3:00PM", "Assistant");
        Staff staff = new Staff("Jim", "21st Street", "631-456-7534", "ehaf@mail.net", "102 Brown", 88000, "Senior Developer");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}


/*Sample Run:
Person	Name: John	| Address: 1 Monroe Ave	| Email: dogcat123@yahoo.com	| Phone: 631-000-1234
Student	Name: Bob	| Address: 123rd St	| Email: cat4321@gmail.com	| Phone: 123-456-7890	| Status: Senior
Employee	Name: Jorge	| Address: 45 Gate Ave	| Email: greenhornett@outlook.com	| Phone: 872-131-2312	| Office: Brown 101	|Salary: 100000.0
Faculty	Name: Rebecca	| Address: 304 Bill Ave	| Email: rebecca321@gmail.com	| Phone: 631-323-1414	| Office: 9:00AM - 12:00PM	|Salary: 75000.0	| Office Hours 12:00PM-3:00PM	|Rank: Assistant
Staff	Name: Jim	| Address: 21st Street	| Email: ehaf@mail.net	| Phone: 631-456-7534	| Office: 102 Brown	|Salary: 88000.0	|Title: Senior Developer
*/
