class MyClass {
   

    static int count = 0;

    MyClass() {
        count++;  // Increment object count
        System.out.println("Object " + count + " created.");
    }

    static void displayCount() {
        System.out.println("Total number of objects created: " + count);
    }
}

public class ObjectCounter {
    public static void main(String[] args) {
        // Create some objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        
        MyClass.displayCount();
    }
}
