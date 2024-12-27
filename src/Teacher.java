public class Teacher extends Person {
    private String subject;
    int yearsOfExperience;
    int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

    @Override
    public String toString() {
        String genderStr = gender ? "Male" : "Female";
        return "Hi, I am " + name + " " + surname +
                ", a " + age + "-year-old " +
                genderStr + ". I teach " + subject + ".";
    }
}
