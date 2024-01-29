package Gennemsnitsberegner;

import java.util.Scanner;

public class Gennemsnitsberegner {

    private int[] values;
    private Scanner scanner;


    public static void main(String[] args) {
        Gennemsnitsberegner app = new Gennemsnitsberegner();
        app.scanner = new Scanner(System.in);

        app.printWelcome();
        app.getValuesLength();
        app.getValues();
        int total = app.calculateTotal();
        double average = app.calculateAverage(total);

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
        this.values = new int[antal];
    }

    public void getValues() {
        System.out.println("Input value(s):");
        for (int i = 0; i < this.values.length; i++) {
            int value = Integer.valueOf(scanner.nextLine());
            this.values[i] = value;
        }

    }

    public int calculateTotal() {
        int sum = 0;
        for (int value :
             this.values) {
            sum += value;
        }
        return sum;
    }

    public double calculateAverage(int total) {
        return (double) total / this.values.length;
    }


}
