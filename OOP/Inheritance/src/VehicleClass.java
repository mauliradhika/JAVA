class VehicleClass {
    void drive(){
        System.out.println("Repairing a vehicle");
    }
}
class Car extends VehicleClass{
    void drive(){
        System.out.println("Repairing a car");
    }
}

class Main{
    public static void main(String[] args) {
        VehicleClass v = new VehicleClass();
        Car c = new Car();
        v.drive();
        c.drive();
    }
}
