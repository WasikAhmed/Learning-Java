package Method;

// Information can be passed to methods as parameter.
// Parameters act as variables inside the method.

// access_modifier static return_data_type method_name(parameter 1, parameter 2,...) {
    // code

    // return
// }

public class Parameter {
    
    public static void Welcome(String name) {

        System.out.println("Hello, " + name);
    }


    public static int GetSum(int num1, int num2) {
        // int sum = num1 + num2;

        // return sum;
        return num1 + num2;
    }


    public static void main(String[] args) {

        Welcome("Arik");

        int x = GetSum(50, 100);
        System.out.println("Sum: " + x);
        int y = GetSum(1000, -200);
        System.out.println("Sum: " + y);

    }

}
