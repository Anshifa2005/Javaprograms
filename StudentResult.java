import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    String course;

    
    void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    
    void displayData() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course     : " + course);
    }
}


class Mark extends Student {
    int[] marks = new int[5];
    int total = 0;
    double average;

   
    void readMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
    }

  
    void displayResult() {
        System.out.println("\n--- Marks and Result ---");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
    }
}


public class StudentResult {
    public static void main(String[] args) {
        Mark m = new Mark();

        m.readData();      
        m.readMarks();     
        m.displayData();   
        m.displayResult(); 
    }
}
