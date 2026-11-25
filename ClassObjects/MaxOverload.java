package ClassObjects;
public class MaxOverload {
    static int max(int a, int b) { return Math.max(a, b); }
    static int max(int a, int b, int c) { return Math.max(a, Math.max(b, c)); }
    static double max(double a, double b) { return Math.max(a, b); }

    public static void main(String[] args) {
        System.out.println("max(4, 9) = " + max(4, 9));
        System.out.println("max(4, 9, 2) = " + max(4, 9, 2));
        System.out.println("max(4.5, 2.8) = " + max(4.5, 2.8));
    }
}
