package Del_2.ageBeregner;

import java.time.*;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private final LocalDate dateOfBirth;

    public Person(String firstName, String middleName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
        this(null, null, null, LocalDate.now());
    }

    public Person(String firstName, String lastName) {
        this(firstName, null, lastName, LocalDate.now());
    }

    public Person(String fullName) {
        setFullName(fullName);
        this.dateOfBirth = LocalDate.now();
    }

    public Person(String firstName, String middleName, String lastName) {
        this(firstName, middleName, lastName, LocalDate.now());
    }

    public Person(String firstName, LocalDate dateOfBirth) {
        this(firstName, null, null, dateOfBirth);
    }

    public Person(Person person) {
        this(person.firstName, person.middleName, person.lastName, person.dateOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return 1;
    }

    public String getFullName() {
        return hasMiddleName() ? this.firstName + " " + this.middleName + " " + this.lastName : this.firstName + " " + this.lastName;
    }

    public void setFullName(String fullName) {
        int firstGap = fullName.indexOf(" ");
        int lastGap = fullName.lastIndexOf(" ");

        this.firstName = fullName.substring(0, firstGap);
        this.lastName = fullName.substring(lastGap+1);
        this.middleName = firstGap == lastGap ? null : fullName.substring(firstGap+1, lastGap);
    }

    public boolean hasMiddleName() {
        return this.middleName != null;
    }

    @Override
    public String toString() {
        return getFullName() + " is " + this.getAge() + " years old.";
    }

}
