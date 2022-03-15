import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        double radius,volume;
        Scanner in = new Scanner(System.in);
        Sphere s = new Sphere();
        System.out.println("Enter the radius of sphere:");
        radius=in.nextDouble();
        System.out.println("The volume is "+s.sphereVolume(radius));
    }
}
