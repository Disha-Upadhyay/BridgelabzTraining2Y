import java.util.Scanner;

public class ArrayIndexException {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }
    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");

        } catch (RuntimeException e) {
            System.out.println("RuntimeException occurred");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        handleException(names);
        sc.close();
    }
}
