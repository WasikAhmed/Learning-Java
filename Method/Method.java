package Method;

// Access modifiers
// public
// private
// protected

// static -> means that the method belongs to the Main class and not an object of the Main class.

// int -> integer
// float -> float
// double -> double
// void -> null

// access_modifier static return_data_type method_name() {
        // block of code
// }

public class Method {

    public static int num1, num2, sum;

    public static int GetSum() {
        num1 = 10;
        num2 = 20;
        sum = num1 + num2;

        return sum;
    }
    
    public static void Welcome() {

        System.out.println("Hello, Arik!");
    }

    public static void PrintDetails() {

        System.out.println("Your details");
        System.out.println("Name: Arik");
        System.out.println("Sex: 21");
        System.out.println("CGPA: 4.00");
    }

    public static void main(String[] agrs) {

        Welcome();

        PrintDetails();

        int x = GetSum();

        System.out.println("The sum of num1 and num2 equals to " + x);

    }

}