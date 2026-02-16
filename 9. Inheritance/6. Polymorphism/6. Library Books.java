/* In this exercise, you are going to be working with 4 classes, a Book superclass with TextBook and Novel subclasses, and a BookTester class to run your program.

For the Book, TextBook, and Novel class, you will create a constructor and all getters and setters. 
Be sure to follow standard naming conventions for your getters and setters (except for the one exception noted below)! Additional information for each class is below.

Book Class
The Book class will have a title and author as instance variables. The constructor should follow this format:

public Book(String title, String author)
It should also have a toString method that prints

Book: TITLE
where TITLE is replaced with the title of the book.

TextBook Class
The TextBook class will have an edition and whether it’s an ebook as instance variables. The constructor should follow this format:

public TextBook(String title, String author, 
                int edition, boolean isEbook)
The ebook field needs a getter named isEbook.

It should also override the toString method to print

Textbook edition # EDITION
where EDITION is replaced with the edition of the book.

Novel Class
The Novel class will have the reading level and the genre as instance variables. The constructor should follow this format:

public Novel(String title, String author, 
            int readingLevel, String genre)
It should also override the toString method to print

GENRE Novel
where GENRE is replaced with the genre of the book.

BookTester
In the tester class, you should create an ArrayList that will store all the books in your library. 
Then create your library by adding at least 3 textbooks and 3 novels to the ArrayList.

After creating your library, use a loop to access the ArrayList and print out the object and any information you have access to. */

public class Book
{

    // Start here!
    private String title;
    private String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String toString() {
        return "Book: " + title;
    }
}

public class Novel extends Book
{
    
    // Start here!
    private int readingLevel;
    private String genre;
    
    public Novel(String title, String author, int readingLevel, String genre) {
        super(title, author);
        this.readingLevel = readingLevel;
        this.genre = genre;
    }
    
    public int getReadingLevel() {
        return readingLevel;
    }
    
    public void setReadingLevel(int readingLevel) {
        this.readingLevel = readingLevel;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String toString() {
        return genre + " Novel";
    }
}

public class TextBook extends Book
{

    // Start here!
    private int edition;
    private boolean isEbook;
    
    public TextBook(String title, String author, int edition, boolean isEbook) {
        super(title, author);
        this.edition = edition;
        this.isEbook = isEbook;
    }
    
    public int getEdition() {
        return edition;
    }
    
    public void setEdition(int edition) {
        this.edition = edition;
    }
    
    public boolean isEbook() {
        return isEbook;
    }
    
    public void setIsEbook(boolean isEbook) {
        this.isEbook = isEbook;
    }
    
    public String toString() {
        return "Textbook edition # " + edition;
    }
}

import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        ArrayList<Book> library = new ArrayList<Book>();
        library.add(new TextBook("Cool", "Jeff", 67, false));
        library.add(new TextBook("Brain", "Bob", 41, true));
        library.add(new TextBook("Mass", "Albert", 5, false));
        library.add(new Novel("Rah", "Paul", 10, "Gaming"));
        library.add(new Novel("Goober", "John", 6, "Fiction"));
        library.add(new Novel("Sigma", "Mr. Mulvaney", 100, "Sci-Fi"));
        
        for (Book book : library) {
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
            System.out.println(book);
        }
    }
}