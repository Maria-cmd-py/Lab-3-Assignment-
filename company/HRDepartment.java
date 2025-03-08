// HRDepartment.java (Inside company package - Main Class)
package company;
public class HRDepartment {
    public static void main(String[] args) {
        Employee employee = new Employee(5000); // Create an employee with $5000 salary
        // View salary
        employee.showSalary();
        // Request salary increase
        employee.requestSalaryIncrease(1000);
        // Update salary (HR can modify salary directly)
        employee.salary += 1000; // Protected: Accessible within the same package
        System.out.println("Salary updated by HR.");
        employee.showSalary(); // Check updated salary
    }
}