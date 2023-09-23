import java.util.*;


public class Input {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");

        String Name = input.nextLine();

        String WelcomeMessage = "Hello " + Name;

        System.out.println(WelcomeMessage);

    }

}
