class Initializer{
    static int initialValues;
    static{
        initialValues = 1000;
    }
}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Before creating instance: " + Initializer.initialValues);
        Initializer obj = new Initializer();
        System.out.println("After creating instance: " + Initializer.initialValues);
    }
}
