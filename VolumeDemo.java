import java.util.Scanner;


interface Volume {
    double pi = 3.14159;  

    void readdata();      
    void dispvolume();    
}


class Sphere implements Volume {
    private double radius;
    private double volume;

    
    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        radius = sc.nextDouble();
    }

   
    public void dispvolume() {
        volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        System.out.println("Volume of Sphere = " + volume);
    }
}


class Cylinder implements Volume {
    private double radius, height;
    private double volume;

   
    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        height = sc.nextDouble();
    }

    
    public void dispvolume() {
        volume = pi * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}

public class VolumeDemo {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        Cylinder c = new Cylinder();

        System.out.println("---- Sphere ----");
        s.readdata();
        s.dispvolume();

        System.out.println("\n---- Cylinder ----");
        c.readdata();
        c.dispvolume();
    }
}
