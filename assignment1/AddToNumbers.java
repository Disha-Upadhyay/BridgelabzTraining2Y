import java.util.*;
public class AddToNumbers {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter First Number =");
        a=sc.nextInt();
        System.out.println("Enter Second Number =");
        b=sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of Two numbers = "+sum);
    }
}
