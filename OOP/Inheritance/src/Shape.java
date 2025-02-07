class Shapes {
    double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shapes{
    double l;
    double b;

    Rectangle(double l, double b){
        this.l=l;
        this.b=b;
    }
    double getArea(){
        return this.l*this.b;
    }
}

public class Shape{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3.0,3.0);
        double area = r.getArea();
        System.out.println("Area: "+area);
    }
}
