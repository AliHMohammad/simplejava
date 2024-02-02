package Del_2.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("Ali Haider Mohammad", 2000);
        Person p1 = new Person("Bo Ole");

        Person[] arr = {s1, p1};

        /*for (Person person : arr){
            if (person instanceof Student) {
                person = (Student) person;
            }

            System.out.println(person);
        }*/

        for (var person
                :
             arr) {
            System.out.println(person);
        }
    }
}
