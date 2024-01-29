package PersonerMedAlder;

import java.util.Scanner;

public class PersonerMedAlder {

    private int[] ages;
    private String[] names;
    private Scanner scanner;


    public static void main(String[] args) {
        PersonerMedAlder app = new PersonerMedAlder();
        app.scanner = new Scanner(System.in);

        app.printWelcome();
        app.getValuesLength();
        app.getValues();
        int total = app.calculateTotal();
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
        System.out.println("Hvor mange personer?");
        int antal = Integer.parseInt(scanner.nextLine());
        this.ages = new int[antal];
        this.names = new String[antal];
    }

    public void getValues() {

        for (int i = 0; i < this.ages.length; i++) {
            System.out.println("Input name:");
            String name = scanner.nextLine();
            this.names[i] = name;

            System.out.println("Input age:");
            int age = Integer.parseInt(scanner.nextLine());
            this.ages[i] = age;
        }

    }

    public int calculateTotal() {
        int sum = 0;

        for (int value :
                this.ages) {
            sum += value;
        }

        return sum;
    }

    public double calculateAverage() {
        return (double) calculateTotal() / this.ages.length;
    }
}
