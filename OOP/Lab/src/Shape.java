class Rectangle{
    double height;
    double width;

    Rectangle(){
        this(0, 0);
        System.out.println("Values Needed");
    }
    Rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }
    double area(){
        return this.height*this.width;
    }

    double perimeter(){
        return 2*(this.height+this.width);
    }
}

public class Shape {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(12.6,14.5);

        System.out.println("Area: " +r1.area() + " "+"Perimeter: "+r1.perimeter());
        System.out.println("Area: " +r2.area() + " "+"Perimeter: "+r2.perimeter());
    }
}
