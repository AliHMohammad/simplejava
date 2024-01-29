package TommeBeregner;

import java.util.Scanner;

public class TommeBeregner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast en længde i tommer:");
        double tommer = Double.parseDouble(scanner.nextLine());
        double centimeter = toCentimeter(tommer);

        System.out.println(tommer + " tommer svarer til " + centimeter + " centimeter");
    }

    public static double toCentimeter(double tommer) {
        return tommer * 2.54;
    }
}
