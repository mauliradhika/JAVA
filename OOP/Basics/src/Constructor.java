class Square{
    int side;

    //Constructors -> Basically special methods, generally used to initialize the values or class variables.
    //2 types -> Default and Parameterized
    //Name of the Constructor will always be same as the class name

    //Method to display side
    void display(){
        System.out.println("Side: "+side);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Square s = new Square();
    }
}
