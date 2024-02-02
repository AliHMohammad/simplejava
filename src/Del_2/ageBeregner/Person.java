package Del_2.ageBeregner;


public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;

    public Person(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
    }

    public Person() {
        this(null, null, null, 0);
    }

    public Person(String firstName, String lastName) {
        this(firstName, null, lastName, 0);
    }

    public Person(String fullName) {
        this(fullName.substring(0, fullName.indexOf(" ")), fullName.indexOf(" ") == fullName.lastIndexOf(" ") ? null : fullName.substring(fullName.indexOf(" ")+1, fullName.lastIndexOf(" ")), fullName.substring(fullName.lastIndexOf(" ")+1), 0);
    }

    public Person(String firstName, String middleName, String lastName) {
        this(firstName, middleName, lastName, 0);
    }

    public Person(String firstName, int age) {
        this(firstName, null, null, age);
    }

    public Person(Del_2.Person.Person person) {
        this(person.getFirstName(), person.getMiddleName(), person.getLastName(), person.getAge());
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
        return age;
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
        return getFullName() + " is " + this.age + " years old.";
    }

    public void makeHarry() {
        firstName = "Harry";
        lastName = "Potter";
        age = 13;
    }
}
