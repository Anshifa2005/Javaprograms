import java.util.Scanner;

class Complex {
    double real;
    double imag;

    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part: ");
        real = sc.nextDouble();
        System.out.print("Enter imaginary part: ");
        imag = sc.nextDouble();
    }

  
    Complex add(Complex c2) {
        Complex temp = new Complex();
        temp.real = this.real + c2.real;
        temp.imag = this.imag + c2.imag;
        return temp;
    }

    void display() {
        System.out.println("Complex number: " + real + " + " + imag + "i");
    }
}

public class ComplexSum {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3; // for result

        System.out.println("Enter first complex number:");
        c1.readData();

        System.out.println("\nEnter second complex number:");
        c2.readData();

        
        c3 = c1.add(c2);

        System.out.println("\n--- Result ---");
        c1.display();
        c2.display();
        System.out.print("Sum = ");
        c3.display();
    }
}
