class Constant{
    final static double PI= 3.14159;
    static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
}
public class StaticFinalV {
    public static void main(String[] args) {
        double radius = 5.0;
        double area = Constant.calculateCircleArea(radius);
        System.out.println("Area of the circle: " + area);
    }
}

