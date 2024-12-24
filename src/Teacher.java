
public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private int Salary;

    public Teacher(String name, String surname, int age,boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name,surname, age,gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.Salary = salary;
    }

    public void giveRaise(double percentage) {
        Salary += Salary * (percentage / 100);
    }

    @Override
    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }

    public double getSalary() {
        return Salary;
    }

    public void setYearsOfExperience(int i) {
        yearsOfExperience = i;
    }

    public void setSubject(String next) {
        subject = next;
    }

    public void setSalary(int i) {
        Salary = i;

    }
}
