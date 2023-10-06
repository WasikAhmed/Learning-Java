package OOP.ClassAndObject;

import java.util.Scanner;

// Class -> bluprint

public class Car {

    public String Name, Model;
    public int Price;

    public void PrintDetails() {
        System.out.println(Name);
        System.out.println(Model);
        System.out.println(Price);
    }

    public static void main(String[] args) {
        
        // creating object
        Car car1 = new Car();
        car1.Name = "BMW";
        car1.Model = "XYZ-123";
        car1.Price = 500000;

        System.out.println("Car 1 details: ");
        // System.out.println(car1.Name);
        // System.out.println(car1.Model);
        // System.out.println(car1.Price);

        car1.PrintDetails();

        // creating object
        Car car2 = new Car();
        car2.Name = "Ferrari";
        car2.Model = "abc-567";
        car2.Price = 100000;

        System.out.println("Car 2 details: ");
        // System.out.println(car2.Name);
        // System.out.println(car2.Model);
        // System.out.println(car2.Price);

        car2.PrintDetails();

    }
    
}
