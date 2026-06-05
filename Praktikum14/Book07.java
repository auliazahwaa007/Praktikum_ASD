package Praktikum14;

public class Book07 {
    public String isbn;
    public String title;

    public Book07(){

    }

    public Book07(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String toString() {
        return " ISBN: " + this.isbn + " Title: " + this.title;       
    }
}
