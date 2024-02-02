package Del_2.Person;

public class Student extends Person {
    private int schoolYear;

    public Student(String fullName) {
        super(fullName);
    }

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
        this.schoolYear = 0;
    }

    public Student(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.schoolYear = 0;
    }

    public Student(String fullName, int schoolYear) {
        super(fullName);
        this.schoolYear = schoolYear;
    }

    public Student(String firstName, String lastName, int schoolYear) {
        super(firstName, lastName);
        this.schoolYear = schoolYear;
    }

    public Student(String firstName, String middleName, String lastName, int schoolYear) {
        super(firstName, middleName, lastName);
        this.schoolYear = schoolYear;
    }

    public Student(Student student) {
        super(student.getFirstName(), student.getMiddleName(), student.getLastName(), student.getAge());
        this.schoolYear = student.schoolYear;
    }

    public Student() {
        super();
        this.schoolYear = 0;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }


    @Override
    public String toString() {
        return getFullName() + " is in year: " + this.schoolYear;
    }
}
