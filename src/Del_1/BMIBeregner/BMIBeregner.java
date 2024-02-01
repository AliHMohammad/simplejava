package Del_1.BMIBeregner;

import java.util.Scanner;

public class BMIBeregner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Velkommen til BMI-beregneren");

        System.out.println("Indtast din vægt i kg:");
        double weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Indtast din højde i meter:");
        double height = Double.parseDouble(scanner.nextLine());

        if (height > 100) {
            height /= 100;
        }

        double BMI = calculateBMI(weight, height);

        System.out.println("Du har en BMI på " + BMI);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
