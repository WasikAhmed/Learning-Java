package Conditions;

// if(condition) {
//     code
// }

import java.util.*;

public class If {

    public static int num1, num2;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        if(true) {
            System.out.println("Hello");
        }

        if(false) {
            System.out.println("Hi");
        }

        if(10 == 10) {
            System.out.println("Hello");
        }

        System.out.println("Please enter values to check");
        System.out.print("Input number 1: ");
        num1 = sc.nextInt();
        System.out.print("Input number 2: ");
        num2 = sc.nextInt();

        if(num1+num2 == 50) {
            System.out.println("Sum of number 1 and number 2 is equal to 50");
        }

        if(num1+num2 > 50) {
            System.out.println("Sum of number 1 and number 2 is greater than 50");
        }

        if(num1+num2 < 50) {
            System.out.println("Sum of number 1 and number 2 is less than 50");
        }

    }
}
