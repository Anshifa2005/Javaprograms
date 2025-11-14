import java.util.Scanner;


class NumberOperations {
    private int number;

   
    public NumberOperations(int number) {
        this.number = number;
    }

  
    public int sumOfDigits() {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

 
    public int reverseNumber() {
        int reverse = 0;
        int temp = number;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return reverse;
    }
}


public class SumAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        NumberOperations obj = new NumberOperations(num);


        System.out.println("Sum of digits: " + obj.sumOfDigits());

   
        System.out.println("Reverse of the number: " + obj.reverseNumber());

        sc.close();
    }
}
