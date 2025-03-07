// Classroom.java (Inside school.classes package)
package school.classes;
import school.students.Student;
import java.util.ArrayList;
public class Classroom {
    private ArrayList<Student> students = new ArrayList<>();
    // Method to add a student to the classroom
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added to the classroom.");
    }
    // Method to display all students in the classroom
    public void displayAllStudents() {
        System.out.println("Students in the classroom:");
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}