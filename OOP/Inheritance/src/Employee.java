class Emp{
    int salary;
    Emp(int salary){
        this.salary = salary;
    }
    void work(){
        System.out.println("Employee");
    }
    int getSalary(){
        return salary;
    }
}

class HR extends Emp{
    HR(int salary){
        super(salary);
    }
    void work(){
        System.out.println("Managing Employee");
    }
    void addEmp(){
        System.out.println("\nAdding New Employee");
    }
}

public class Employee {
    public static void main(String[] args) {
        Emp e = new Emp(40000);
        HR m = new HR(700000);
        e.work();
        System.out.println(e.getSalary());
        m.work();
        System.out.println(m.getSalary());
    }
}
