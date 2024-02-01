import java.util.Scanner;
import java.time.LocalDate;

public class HvadHedderDu {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        while (true) {
            System.out.println("Hvad hedder du? '' for at stoppe programmet.");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Hej " + name + ", hvor gammel er du?");
            int age = Integer.valueOf(scanner.nextLine());

            int dateOfBirth = (date.getYear() - 1) - age;

            System.out.println("Okay, så må du være født i " + dateOfBirth + ", medmindre du allerede har haft fødselsdag i år.");
        }

        System.out.println("Hav en god dag :)");
    }
}