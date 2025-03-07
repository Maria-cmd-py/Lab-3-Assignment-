// Teacher.java (Inside school.teachers package)
package school.teachers;
public class Teacher {
    private String name;
    private String subject;
    private int experience;
    // Constructor
    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }
    // Method to display teacher details
    public void displayTeacherInfo() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience + " years");
    }
}