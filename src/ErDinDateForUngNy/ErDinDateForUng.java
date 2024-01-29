import java.util.Scanner;

public class ErDinDateForUng {

    private int myAge;
    private int dateAge;
    private Scanner scanner = new Scanner(System.in);


    public static void main(String... args) {
        ErDinDateForUng app = new ErDinDateForUng();
        app.start();
    }

    public void start() {
        printWelcome();

        while (true) {
            writeYourAge();
            writePartnerAge();
            printErDinDateForUng();
        }
    }

    public void printErDinDateForUng() {
        int minimumsAlder = getMinimumAge();

        if (minimumsAlder <= dateAge) {
            System.out.println("Modparten er gammel nok");
        } else {
            System.out.println("Modparten er IKKE GAMMEL NOK!");
        }
    }

    public void writeYourAge() {
        System.out.println("Hvad er din alder?");
        myAge = Integer.valueOf(scanner.nextLine());
    }

    public void writePartnerAge() {
        System.out.println("Hvad er modpartens alder?");
        dateAge = Integer.valueOf(scanner.nextLine());
    }

    public int getMinimumAge() {
        return (myAge / 2 ) + 7;
    }

    public void printWelcome() {
        System.out.println("WELKOMMEN!");
    } 
}