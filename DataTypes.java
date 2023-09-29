public class DataTypes {

    // Data Types
    // int -> stores whole numbers -> 4 bytes
    // float -> stores decimal numbers -> 4 bytes
    // double -> stores decimal numbers -> 8 bytes
    // char -> stores single character -> 2 bytes
    // long -> stores whole numbers -> 8 bytes
    // boolean -> true or false -> 1 bit
    // short -> stores whole numbers -> 2 bytes
    // byte -> stores whole numbers -> 1 byte
    // String -> stores text

    public static void main(String[] args) {
     
        int a = 1000;
        System.out.println("Data type of variable 'a' : " + ((Object)a).getClass().getSimpleName());
        // System.out.println("Data type of a : " + ((Object)a).getClass());
        
        float f = 69.69f;
        System.out.println("Data type of variable 'f' : " + ((Object)f).getClass().getSimpleName());

        double d = 50.029854;
        System.out.println("Data type of variable 'd' : " + ((Object)d).getClass().getSimpleName());

        char c = 'A';
        System.out.println("Data type of variable 'c' : " + ((Object)c).getClass().getSimpleName());

        long l = 50000000;
        System.out.println("Data type of variable 'l' : " + ((Object)l).getClass().getSimpleName());

        boolean bool = true;
        System.out.println("Data type of variable 'b' : " + ((Object)bool).getClass().getSimpleName());

        short s = 200;
        System.out.println("Data type of variable 's' : " + ((Object)s).getClass().getSimpleName());

        byte b = 10;
        System.out.println("Data type of variable 'b' : " + ((Object)b).getClass().getSimpleName());

        String str = "Wasik";
        System.out.println("Data type of variable 'str' : " + ((Object)str).getClass().getSimpleName());

    }
}
