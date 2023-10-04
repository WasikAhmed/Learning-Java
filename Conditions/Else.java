package Conditions;

// if(condition) {
//     code
// }
// else {
//     code
// }

import java.util.*;

public class Else {

    public static int num1, num2;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Please enter values to check: ");

        System.out.print("Enter number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        num2 = sc.nextInt();

        int Sum = num1 + num2;

        if(Sum == 50) {
            System.out.println("Sum of number 1 and number 2 is equal to 50");
        }
        else {
            System.out.println("Sum of number 1 and number 2 is not equal to 50");
        }

    }
}
