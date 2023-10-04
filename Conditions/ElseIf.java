package Conditions;

// if(condition){
//     code
// }
// else if(condition) {
//     code
// }
// else {
//     code
// }

import java.util.*;

public class ElseIf {

    public static int num1, num2;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter values to check");
        System.out.print("Input number 1: ");
        num1 = sc.nextInt();
        System.out.print("Input number 2: ");
        num2 = sc.nextInt();

        int Sum = num1 + num2;

        if(Sum > 50) {
            System.out.println("Sum of number 1 and number 2 is greater than 50");
        }
        else if(Sum < 50) {
            System.out.println("Sum of number 1 and number 2 is less than 50");
        }
        else {
            System.out.println("Sum of number 1 and number 2 is equal to 50");
        }

    }
}
