import java.util.*;
public class VolumeOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r,h;
        r = sc.nextDouble();
        h = sc.nextDouble();
        m1(r,h);
    }
    public static void m1(double radius,double height){
        double Volume = (3.14 * (radius*radius) * height);
        System.out.println("Volume of Cylinder ="+Volume);
    }
}
