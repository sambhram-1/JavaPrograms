package ClassObjects;
public class empWc {
    private final String name;
    private final double hoursWorked, hourlyRate;
    empWc(String name, double hoursWorked, double hourlyRate) {
        if (hoursWorked < 0 || hourlyRate < 0) throw new IllegalArgumentException("Hours and rate must be non-negative");
        this.name = name; this.hoursWorked = hoursWorked; this.hourlyRate = hourlyRate;
    }
    double weeklyPay() {
        double regular = Math.min(hoursWorked, 40) * hourlyRate;
        double overtime = Math.max(0, hoursWorked - 40) * hourlyRate * 1.5;
        return regular + overtime;
    }
    public static void main(String[] args) {
        empWc employee = new empWc("Dev", 45, 200);
        System.out.printf("%s's weekly pay: %.2f%n", employee.name, employee.weeklyPay());
    }
}
