package Del_1.Gennemsnitsberegner;

import java.util.Scanner;

public class Gennemsnitsberegner {

    private double[] values;
    private Scanner scanner;


    public static void main(String[] args) {
        Gennemsnitsberegner app = new Gennemsnitsberegner();
        app.scanner = new Scanner(System.in);

        app.printWelcome();
        app.getValuesLength();
        app.getValues();
        double total = app.calculateTotal();
        double average = app.calculateAverage();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }


    public void printWelcome() {
        System.out.println("==========");
        System.out.println("WELCOME!");
        System.out.println("==========");
    }

    public void getValuesLength() {
        System.out.println("Hvor mange værdier?");
        int antal = Integer.parseInt(scanner.nextLine());
        this.values = new double[antal];
    }

    public void getValues() {
        System.out.println("Input value(s):");
        for (int i = 0; i < this.values.length; i++) {
            double value = Double.parseDouble(scanner.nextLine());
            this.values[i] = value;
        }

    }

    public double calculateTotal() {
        double sum = 0;

        for (double value :
             this.values) {
            sum += value;
        }

        return sum;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / this.values.length;
    }


}
