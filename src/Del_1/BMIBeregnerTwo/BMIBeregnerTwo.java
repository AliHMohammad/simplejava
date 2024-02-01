package Del_1.BMIBeregnerTwo;

import java.util.Scanner;

public class BMIBeregnerTwo {

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
        printCategory(BMI);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void printCategory(double BMI) {
        System.out.print("Du er ");

        if (BMI < 18.5) {
            System.out.print("undervægtig");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.print("normalvægtig");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.print("overvægtig");
        } else {
            System.out.print("svært overvægtig");
        }
    }
}
