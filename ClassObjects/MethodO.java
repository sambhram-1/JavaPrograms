public class MethodO {
    static int area(int side) { return side * side; }
    static int area(int length, int width) { return length * width; }
    static double area(double radius) { return Math.PI * radius * radius; }

    public static void main(String[] args) {
        System.out.println("Square area = " + area(4));
        System.out.println("Rectangle area = " + area(4, 6));
        System.out.printf("Circle area = %.2f%n", area(2.5));
    }
}
