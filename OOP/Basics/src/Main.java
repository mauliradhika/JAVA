class A{
    //Instance Variable (Static/Class Variables)
    int age;
    String Name;

    //Defining a function in the class
    void display(){
        System.out.println("Age: "+age);
        System.out.println("Name: "+Name);
    }
}

class Rectangle{
    int length;
    int breadth;

    //Method Overloading - Same method name but different number/type of argument
    void area(){
        System.out.println("Method with return type void and no arguments");
    }
    void area(int a){
        System.out.println("Method with return type void and one argument-int");
    }
    void area(double a){
        System.out.println("Method with return type void and one argument-double");
    }
    /*
    This will give error because return type matters while overloading
    int area(int a){
        System.out.println("Method with return type int and one argument");
        return 0;
    }
    */

    //To return the object of the same class

    Rectangle returnObject(){
        return new Rectangle();//Return the instance of rectangle class
    }
}

public class Main {
    public static void main(String[] args) {
        A obj = new A();
        /*obj - object or class A or reference variable of class A
        new - keyword to assign memory in heap dynamically
        A() - Default Constructor of class A
        */

        //How to access class variable?
        obj.age=20;
        obj.Name="Mauli";
        System.out.println("Age : "+obj.age);
        System.out.println("Name:"+obj.Name);

        //Accessing class methods
        obj.display();
        Rectangle r = new Rectangle();
        r.area();//Calls the function with no parameter
        r.area(10);//Calls the function with one int parameter
        r.area(12.625);//Calls the function with one double parameter

        Rectangle store = r.returnObject();
        store.area();
        store.area(10);
        store.area(12.624);
    }
}