class MathUtility {
    static int add(int a, int b) {
        return a + b;
    }
}

class StaticMethods {
    public static void main(String[] args) {

        int sum = MathUtility.add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
