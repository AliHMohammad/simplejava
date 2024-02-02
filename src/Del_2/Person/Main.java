package Del_2.Person;

public class Main {

    public static void main(String[] args) {
        var p1 = new Person("Ali Haider Amier");
        var p2 = new Person("Brian Olesen");
        var s1 = new Student("Harry Potter");

        Person[] persons = {p1, p2, s1};

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.println(persons[0].getClass());
        System.out.println(persons[1].getClass());
        System.out.println(persons[2].getClass());

        s1.setSchoolYear(3);
        persons[2].getSchoolYear();
        s1.getSchoolYear();

        /*
        System.out.println(ali.getMiddleName());
        System.out.println(brain.getMiddleName());
        System.out.println(ali);
        System.out.println(brain);
        */
    }
}
