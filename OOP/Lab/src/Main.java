class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age = age;
    }
    void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
    }
}
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice",12);
        Person p2 = new Person("Ram",54);

        p1.printInfo();
        p2.printInfo();
    }
}