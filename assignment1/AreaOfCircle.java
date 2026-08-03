import java.util.*;
public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r;
        r = sc.nextDouble();
        m1(r);
    }
    public static void m1(double Radius){
        double Area=3.14*(Radius*Radius);
        System.out.println("Area of Circle ="+Area);
    }
}
