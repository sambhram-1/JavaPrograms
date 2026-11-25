abstract class ShapeBase {
    abstract double area();
}

public class AbsShape extends ShapeBase {
    private final double radius;
    AbsShape(double radius) {
        if (radius < 0) throw new IllegalArgumentException("Radius cannot be negative");
        this.radius = radius;
    }
    @Override double area() { return Math.PI * radius * radius; }
    public static void main(String[] args) {
        AbsShape circle = new AbsShape(3);
        System.out.printf("Circle area: %.2f%n", circle.area());
    }
}
