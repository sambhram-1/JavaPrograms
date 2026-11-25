public class emp {
    private final int id;
    private final String name;
    private final double salary;
    emp(int id, String name, double salary) {
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
        this.id = id; this.name = name; this.salary = salary;
    }
    void display() { System.out.printf("ID: %d%nName: %s%nSalary: %.2f%n", id, name, salary); }

    public static void main(String[] args) {
        emp employee = new emp(101, "Kiran", 35000);
        employee.display();
    }
}
