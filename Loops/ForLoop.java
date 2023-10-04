package Loops;

// for loop is used when we know the exact number of iterations.

// for(initialization; condition; increment/decrement) {
//     // code 
// }

public class ForLoop {
    
    public static void main(String[] args) {
    
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");

        for(int i=0; i<5; i++) {
            System.out.println("Hello");
        }

        for(int i=0; i<5; i++) {
            System.out.println(i + " Hello");
        }

        // Find the sum of total numbers between 1 to 100
        int Sum = 0;
        for(int i=1; i<=100; i++) {
            Sum = Sum + i;
            // Sum += i;
        }
        System.out.println("Sum of total numbers between 1 to 100: " + Sum);

        // Find the sum of total even numbers between 1 to 50
        int EvenSum = 0;
        for(int i=0; i<=50; i=i+2) {
            EvenSum = EvenSum + i;
            // EvenSum += i;
        }
        System.out.println("Sum of total even numbers between 1 to 50: " + EvenSum);


        // Print all the odd numbers between 1 to 100
        System.out.println("Odd numbers between 1 to 100: ");
        for(int i=1; i<=100; i++) {
            if(i%2 != 0) {
                System.out.print(i + " ");
            }
        }

    }
}
