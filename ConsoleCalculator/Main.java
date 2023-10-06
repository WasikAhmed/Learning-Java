public class Main {
    
    public static Calculator calculator;

    public static void main(String[] args) {
        
        calculator = new Calculator();

        calculator.showInitialOptions();

        boolean on = true;

        while(on) {
            switch (calculator.getUserChoice()) {
                case 1:
                    double addition = calculator.Add(calculator.inputNumOne(), calculator.inputNumTwo());

                    System.out.println("Sum: " + addition);
                    calculator.showInitialOptions();
                    break;
                case 2:
                    double substraction = calculator.Sub(calculator.inputNumOne(), calculator.inputNumTwo());

                    System.out.println("Substraction: " + substraction);
                    calculator.showInitialOptions();
                    break;
                case 3:
                    double multiplication = calculator.Multiply(calculator.inputNumOne(), calculator.inputNumTwo());

                    System.out.println("Multiplication: " + multiplication);
                    calculator.showInitialOptions();
                    break;
                case 4:
                    double division = calculator.Divide(calculator.inputNumOne(), calculator.inputNumTwo());

                    System.out.println("Division: " + division);
                    calculator.showInitialOptions();
                    break;
                case 5:
                    System.out.println("Thank you for using my Calculator :)");
                    on = false;
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;
            }
        }

    }
}
