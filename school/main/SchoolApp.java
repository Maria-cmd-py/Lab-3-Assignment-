// SchoolApp.java (Inside school.main package)
package school.main;
import school.students.Student;
import school.teachers.Teacher;
import school.classes.Classroom;
public class SchoolApp {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Ali", 101, "A");
        Student student2 = new Student("Sara", 102, "B");
        // Create a teacher
        Teacher teacher = new Teacher("Ms. Sana", "OOP", 5);
        // Create a classroom and add students
        Classroom classroom = new Classroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        // Display student and teacher details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        teacher.displayTeacherInfo();
        // Display all students in the classroom
        classroom.displayAllStudents();
    }
}