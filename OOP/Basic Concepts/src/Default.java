class Cat{
    String name;
    int age;

    Cat(){
       this.name = "Unknown";
       this.age = 0;
    }
    void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Cat Age: " + age);
    }
}

public class Default {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.displayInfo();
    }
}
