class Dog{
    String name;
    String breed;

    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void printInfo() {
        System.out.println("Dog Name: " + this.name);
        System.out.println("Breed: " + this.breed);
    }
}

public class Setter {
    public static void main(String[] args) {
        Dog d1 = new Dog("Coco", "German");
        Dog d2 = new Dog("Lolo", "French Bulldog");

        System.out.println("Initial Details:");
        d1.printInfo();
        d2.printInfo();

        d1.setName("Max");
        d1.setBreed("German Shepherd");

        d2.setName("Rocky");
        d2.setBreed("Bulldog");

        System.out.println("Updated Details:");
        d1.printInfo();
        d2.printInfo();
    }

}
