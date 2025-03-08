// Employee.java (Inside company package)
package company;
public class Employee {
    protected double salary; // Protected: Only accessible within the same package or subclasses
    // Constructor
    public Employee(double salary) {
        this.salary = salary;
    }
    // Public method: Accessible everywhere
    public void showSalary() {
        System.out.println("Current Salary: $" + salary);
    }
    // Public method: Accessible everywhere
    public void requestSalaryIncrease(double amount) {
        System.out.println("Requested Salary Increase: $" + amount);
    }
}