import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends FileNotFoundException {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\Admin\\OneDrive\\Рабочий стол\\students.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Student> students=new ArrayList<>();
        while(scanner.hasNext()) {
            Student student = new Student();
            student.setName(scanner.next());
            student.setSurname(scanner.next());
            student.setAge(Integer.parseInt(scanner.next()));
            student.setGender(Boolean.parseBoolean(scanner.next()));
            students.add(student);
        }
        File file2 = new File("C:\\Users\\Admin\\OneDrive\\Рабочий стол\\teachers.txt");
        Scanner scanner2 = new Scanner(file);
        ArrayList<Teacher> teachers = new ArrayList<>();

        while(scanner.hasNext()) {
            Teacher teacher = new Teacher();
            teacher.setName(scanner.next());
            teacher.setSurname(scanner.next());
            teacher.setAge(Integer.parseInt(scanner.next()));
            teacher.setGender(Boolean.parseBoolean(scanner.next()));
            teachers.add(teacher);
        }
        System.out.println(students.toString());


    }

}