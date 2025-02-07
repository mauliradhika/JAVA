class Circle{
    double radius;
    Circle(){
        this(1);
        System.out.println("Radius = 1");
    }
    Circle (double radius){
        this.radius=radius;
    }
    double area(){
        return 3.14*this.radius*this.radius;
    }
    double circumference(){
        return 2*3.14*this.radius;
    }
}
public class Sphere {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        System.out.println("Area: "+ c1.area() +" "+"Circumference: "+c1.circumference());
        System.out.println("Area: "+ c2.area() +" "+"Circumference: "+c2.circumference());
    }
}
