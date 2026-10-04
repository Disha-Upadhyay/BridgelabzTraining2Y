package Level2;
import java.util.Scanner;
public class BMI2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            while (true) {
                System.out.print("Enter height in meters: ");
                personData[i][0] = sc.nextDouble();
                if (personData[i][0] > 0) {
                    break;
                }
                System.out.println("Please enter a positive height.");
            }
            while (true) {
                System.out.print("Enter weight in kg: ");
                personData[i][1] = sc.nextDouble();
                if (personData[i][1] > 0) {
                    break;
                }
                System.out.println("Please enter a positive weight.");
            }
            personData[i][2] =
                    personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            }
            else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            }
            else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            }
            else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println(
                    personData[i][0] + "\t" +
                            personData[i][1] + "\t" +
                            personData[i][2] + "\t" +
                            weightStatus[i]);
        }
    }
}
