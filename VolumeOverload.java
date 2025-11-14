class VolumeCalculator {

    
    double volume(double side) {
        return side * side * side;
    }

    
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    
    double volume(double radius, int height) {
        return 3.14159 * radius * radius * height;
    }
}

public class VolumeOverload {
    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();

        double cubeVol = v.volume(5.0);                 
        double boxVol = v.volume(4.0, 3.0, 2.0);         
        double cylVol = v.volume(2.5, 10);               

        System.out.println("Volume of Cube = " + cubeVol);
        System.out.println("Volume of Rectangular Box = " + boxVol);
        System.out.println("Volume of Cylinder = " + cylVol);
    }
}
