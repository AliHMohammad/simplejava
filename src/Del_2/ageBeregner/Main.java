package Del_2.ageBeregner;

public class Main {

    public static void main(String[] args) {
        Person fyldte18igår = new Person("Ali", "Haider", "Mohammad", "2006-02-01");
        Person fylder18idag = new Person("Brian", "Jeppesen", "Ibsen", "2006-02-02");
        Person fylder18imorgen = new Person("Chris", "Jensen", "Ibbesen", "2006-02-03");
        System.out.println(fyldte18igår.getAge());
        System.out.println(fylder18idag.getAge());
        System.out.println(fylder18imorgen.getAge());

        System.out.println("=====");

        System.out.println(fyldte18igår.hasBirthday());
        System.out.println(fylder18idag.hasBirthday());
        System.out.println(fylder18imorgen.hasBirthday());

    }
}
