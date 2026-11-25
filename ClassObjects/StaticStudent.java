public class StaticStudent {
    private static String school = "Dayananda Sagar University";
    private static int count = 0;
    private final int rollNo;
    private final String name;

    StaticStudent(int rollNo, String name) { this.rollNo = rollNo; this.name = name; count++; }
    void display() { System.out.println(rollNo + " - " + name + " - " + school); }
    static int getCount() { return count; }

    public static void main(String[] args) {
        StaticStudent s1 = new StaticStudent(1, "Asha");
        StaticStudent s2 = new StaticStudent(2, "Ravi");
        s1.display(); s2.display();
        System.out.println("Number of objects: " + getCount());
    }
}
