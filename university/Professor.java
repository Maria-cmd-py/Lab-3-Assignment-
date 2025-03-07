// Professor.java (Inside university package)
package university;
public class Professor {
    public static void main(String[] args) {
        Student student = new Student("Ayesha Khan", 101, 85.0);
        // Public: Accessible everywhere
        System.out.println("University: " + student.universityName);
        // Protected: Accessible within the same package
        student.updateGrade(90.5);
        // Default: Accessible within the same package
        student.universityPolicy();
        // Private: Not accessible (Uncommenting will cause an error)
        // System.out.println(student.studentName);
    }
}