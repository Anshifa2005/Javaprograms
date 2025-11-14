import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements (10 or more): ");
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("Please enter at least 10 numbers.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        int smallest = arr[0];
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

       
        for (int num : arr) {
            
            if (num < smallest) {
                smallest = num;
            }

            if (num > largest) {
                secondLargest = largest; 
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found (all elements may be equal).");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
