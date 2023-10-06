import java.util.Scanner;

public class Calculator {

    int Num1, Num2;

    Scanner sc;

    public Calculator() {
        System.out.println("Welcome to my Calculator!!!");
        sc = new Scanner(System.in);
    }

    public void showInitialOptions() {
        System.out.println("1. Add two numbers");
        System.out.println("2. Substract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("5. Exit");
    }

    public int getUserChoice() {
        System.out.print("Please choose an option: ");
        int choice = sc.nextInt();

        return choice;
    }

    public double inputNumOne() {
        System.out.print("Please enter 1st number: ");
        double num = sc.nextDouble();

        return num;
    }

    public double inputNumTwo() {
        System.out.print("Please enter 2nd number: ");
        double num = sc.nextDouble();

        return num;
    }   

    public double Add(double num1, double num2) {
        return num1 + num2;
    }

    public double Sub(double num1, double num2) {
        return num1 - num2;
    }

    public double Multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double Divide(double num1, double num2) {
        return num1 / num2;
    }


}