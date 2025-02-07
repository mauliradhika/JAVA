class Literature{
    String title;
    String author;
    double price;

    Literature(){
        this.title="Unknown";
        this.author="Unknown";
        this.price=0.0;
    }
    Literature(String title, String author){
        this.title = title;
        this.author = author;
        this.price = 0.0;
    }
    Literature(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Literature book1 = new Literature();
        Literature book2 = new Literature("The Great Gatsby", "F. Scott Fitzgerald");
        Literature book3 = new Literature("To Kill a Mockingbird", "Harper Lee", 15.99);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
