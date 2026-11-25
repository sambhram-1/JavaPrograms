public class loc {
    private int instanceValue = 10;

    void showScope() {
        int localValue = 20;
        System.out.println("Instance variable = " + instanceValue);
        System.out.println("Local variable    = " + localValue);
    }

    public static void main(String[] args) {
        new loc().showScope();
    }
}
