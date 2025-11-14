
class OddNumbers implements Runnable {
    private int limit;

    public OddNumbers(int limit) {
        this.limit = limit;
    }

    
    public void run() {
        System.out.println("Odd Number Thread Started...");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
                try {
                    Thread.sleep(200); // to slow down output for clarity
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Odd Number Thread Finished!");
    }
}

class EvenNumbers implements Runnable {
    private int limit;

    public EvenNumbers(int limit) {
        this.limit = limit;
    }

   
    public void run() {
        System.out.println("Even Number Thread Started...");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
                try {
                    Thread.sleep(200); // to slow down output for clarity
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Even Number Thread Finished!");
    }
}

public class OddEvenThreadDemo {
    public static void main(String[] args) {
        int limit = 20; // you can change this limit as needed

       
        OddNumbers oddTask = new OddNumbers(limit);
        EvenNumbers evenTask = new EvenNumbers(limit);

       
        Thread t1 = new Thread(oddTask);
        Thread t2 = new Thread(evenTask);

        t1.start();
        t2.start();
    }
}
