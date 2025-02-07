class Book{
    String name;
    String author;
    String isbn;

    Book(String name, String author, String isbn){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }
    void displayInfo() {
        if (this.name != null) {
            System.out.println("Title: " + this.name);
            System.out.println("Author: " + this.author);
            System.out.println("ISBN: " + this.isbn);
        } else {
            System.out.println("Book does not exist.");
        }
    }
    void removeBook() {
        System.out.println("Removing book: " + this.name);
        this.name = null;
        this.author = null;
        this.isbn = null;
    }
}
public class BookClass {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415");
        Book book2 = new Book("1984", "George Orwell", "978-0451524935");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0060935467");

        System.out.println("Book Collection:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book2.removeBook();

        System.out.println("\nUpdated Book Collection:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
