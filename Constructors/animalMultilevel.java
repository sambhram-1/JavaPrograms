class LivingBeing {
    void breathe() { System.out.println("Breathing..."); }
}
class Mammal extends LivingBeing {
    void feedMilk() { System.out.println("Mammals feed milk to their young."); }
}
public class animalMultilevel extends Mammal {
    void bark() { System.out.println("A dog can bark."); }
    public static void main(String[] args) {
        animalMultilevel dog = new animalMultilevel();
        dog.breathe(); dog.feedMilk(); dog.bark();
    }
}
