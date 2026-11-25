public class person {
    private final String name;
    private final int age;
    person(String name, int age) {
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.name = name; this.age = age;
    }
    void introduce() { System.out.println("Name: " + name + ", age: " + age); }

    public static void main(String[] args) {
        new person("Ananya", 19).introduce();
    }
}
