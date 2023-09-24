// Use Scanner class for input
// Scanner class is in java.util package

import java.util.*;

// methods
// nextInt() -> input integer
// nextLine() -> input string
// nextFloat() -> input float
// nextDouble() -> input double
// nextByte() -> input byte
// nextBoolean() -> input boolean
// nextLong() -> input long
// nextShort -> input short

public class Input {
    
    public static void main(String[] args) {

        // creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        String Name;
        int Age;
        float Cgpa;

        System.out.print("Please enter your name: ");
        Name = sc.nextLine();

        System.out.print("Please enter you age: ");
        Age = sc.nextInt();

        System.out.print("Please enter your CGPA: ");
        Cgpa = sc.nextFloat();

        System.out.println("Your details: ");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Cgpa: " + Cgpa);

    }

}
