class AnimalBase {
    void eat() { System.out.println("Animal eats food."); }
}

public class animalInherit extends AnimalBase {
    void bark() { System.out.println("Dog barks."); }
    public static void main(String[] args) {
        animalInherit dog = new animalInherit();
        dog.eat(); dog.bark();
    }
}
