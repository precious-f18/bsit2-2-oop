public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
        System.out.println(" ");
    }

    public void displayInfo() {
        System.out.println(" ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book " + title + " has been borrowed. Enjoy Reading!");
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Thank you for returning " + title + ".");
    }

    public static void main(String[] args) {
        Book book1 = new Book("Rich Dad Poor Dad", "Robert T. Kiyosaki", 336);
        Book book2 = new Book("Atomic Habits", "James Clear", 320);
        Book book3 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", 499);

        System.out.println("--------------------");

        System.out.println("Book Info:");
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        System.out.println("--------------------");

        System.out.println("Borrowed Book:");
        book2.borrowBook();
        System.out.println(" ");
        System.out.println("Attempting to borrow book again:");
        book2.borrowBook();

        System.out.println("--------------------");

        System.out.println("Returning the Book 2:");
        book2.returnBook();
        book2.displayInfo();
    }
}
