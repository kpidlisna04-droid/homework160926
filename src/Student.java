import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private double averageGrade;

    public Student(int id, String name, int age, double averageGrade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + averageGrade;
    }

    public List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public List<Student> removeStudentById(List<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                break;
            }
        }
        return students;
    }

    public Student findStudentByName(List<Student> students, String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }

        System.out.println("Student not found");
        return null;
    }

    public void printAllStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
