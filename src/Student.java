import java.util.List;
import java.util.ArrayList;

public class Student extends Person {
    int studentID;
    List<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = (int) (Math.random() * 10000);
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}
