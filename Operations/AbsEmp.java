abstract class EmployeeBase {
    protected final String name;
    EmployeeBase(String name) { this.name = name; }
    abstract double calculateSalary();
}

public class AbsEmp extends EmployeeBase {
    private final double monthlySalary;
    AbsEmp(String name, double monthlySalary) { super(name); this.monthlySalary = monthlySalary; }
    @Override double calculateSalary() { return monthlySalary; }
    public static void main(String[] args) {
        AbsEmp employee = new AbsEmp("Nikhil", 42000);
        System.out.printf("%s's monthly salary: %.2f%n", employee.name, employee.calculateSalary());
    }
}
