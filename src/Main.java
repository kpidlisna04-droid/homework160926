import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Anna", 20, 90.5));
        students.add(new Student(2, "Ivan", 21, 85.3));
        students.add(new Student(3, "Maria", 19, 95.7));
        students.add(new Student(4, "Oleh", 22, 78.4));
        students.add(new Student(5, "Sofia", 20, 88.9));

        Student student = new Student(6, "Petro", 21, 91.2);

        student.addStudent(students, student);

        student.removeStudentById(students, 4);

        System.out.println(student.findStudentByName(students, "Maria"));

        student.printAllStudents(students);
    }
}
