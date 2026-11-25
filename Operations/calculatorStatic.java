public class calculatorStatic {
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
    public static void main(String[] args) {
        System.out.println("Add: " + add(12, 4));
        System.out.println("Subtract: " + subtract(12, 4));
        System.out.println("Multiply: " + multiply(12, 4));
        System.out.println("Divide: " + divide(12, 4));
    }
}
