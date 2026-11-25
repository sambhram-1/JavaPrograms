class AnimalParent {
    void eat() { System.out.println("Animals eat."); }
}
class DogChild extends AnimalParent {
    void sound() { System.out.println("Dog: woof"); }
}
class CatChild extends AnimalParent {
    void sound() { System.out.println("Cat: meow"); }
}

public class animalHierarchical {
    public static void main(String[] args) {
        DogChild dog = new DogChild(); CatChild cat = new CatChild();
        dog.eat(); dog.sound(); cat.eat(); cat.sound();
    }
}
