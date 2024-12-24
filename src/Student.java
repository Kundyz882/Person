
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int studentID = 0;
    private int studentId;
    private ArrayList<Integer> grades;



    public Student(String name, String surname,int age,boolean gender, int studentID, int grade) {
        super(name,surname,age,gender);
        this.studentId = ++studentID;
        this.grades = new ArrayList<>();

    }
    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / (double) grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }





}
