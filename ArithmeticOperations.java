public class ArithmeticOperations {
    public static void main(String[] args) {

       
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        
        if (num2 != 0) {
            double quotient = num1 / num2;
            double remainder = num1 % num2;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
            System.out.println("Remainder: Undefined (division by zero)");
        }
    }
}
