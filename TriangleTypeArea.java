public class TriangleTypeArea {
    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Please provide three sides of the triangle as command line arguments.");
            return;
        }

        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("The given sides do NOT form a valid triangle.");
            return;
        }

       
        if (a == b && b == c) {
            System.out.println("Triangle Type: Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Triangle Type: Isosceles");
        } else {
            System.out.println("Triangle Type: Scalene");
        }

       
        double s = (a + b + c) / 2.0;  
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle: " + area);
    }
}
