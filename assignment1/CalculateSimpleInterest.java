import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        m1(p,r,t);
    }
    public static void m1(int principal,int radius,int height){
        double SI = (principal*radius*height)/100;
        System.out.println("Simple Interest = " + SI);
    }
}
