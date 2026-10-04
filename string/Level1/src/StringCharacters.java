import java.util.Scanner;
public class StringCharacters {
    public static char[] getCharacters(String str) {

        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }
    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        char[] result1 = getCharacters(str);
        char[] result2 = str.toCharArray();
        boolean result = compareArrays(result1, result2);
        System.out.println("Characters using user-defined method:");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i] + " ");
        }
        System.out.println();

        System.out.println("Characters using toCharArray():");

        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i] + " ");
        }

        System.out.println();

        System.out.println("Both arrays are same: " + result);

        sc.close();
    }
}
