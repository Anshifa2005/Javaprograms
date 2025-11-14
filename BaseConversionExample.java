import java.util.Scanner;

public class BaseConversionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        System.out.println("Binary: " + binary);

     
        String octal = Integer.toOctalString(number);
        System.out.println("Octal: " + octal);

        String hexadecimal = Integer.toHexString(number);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());

        sc.close();
    }
}
