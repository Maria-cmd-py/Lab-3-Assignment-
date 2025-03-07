// Student.java (Inside university package)
package university;
public class Student {
    private String studentName; // Private: Only accessible within this class
    protected double grade; // Protected: Accessible by subclasses or same package
    public String universityName = "Global Tech University"; // Public: Accessible everywhere
    int studentID; // Default (Package-private): Accessible within the same package
    // Constructor
    public Student(String name, int id, double grade) {
        this.studentName = name;
        this.studentID = id;
        this.grade = grade; }
    // Public method: Accessible to all
    public void showDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade: " + grade); }
    // Protected method: Can be accessed by professors
    protected void updateGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated successfully."); }
    // Default method: Accessible within the same package
    void universityPolicy() {
        System.out.println("University grading policies are subject to annual revision.");
    } }