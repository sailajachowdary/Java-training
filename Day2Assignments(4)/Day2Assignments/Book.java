package Day2Assignments;


class Book {
    protected String isbn;
    protected String title;
    protected double price;

    // Constructor
    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }
}

// Derived class Magazine
class Magazine extends Book {
    private String type;

    // Constructor
    public Magazine(String isbn, String title, double price, String type) {
        super(isbn, title, price);
        this.type = type;
    }

    // Method to display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

// Derived class Novel
class Novel extends Book {
    private String author;

    // Constructor
    public Novel(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    // Method to display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}
