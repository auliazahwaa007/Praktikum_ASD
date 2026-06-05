package Praktikum14;

import java.util.Stack;

public class StackDemo07 {
    public static void main(String[] args) {

        Book07 book1 = new Book07("1234", "Dasar Pemrograman");
        Book07 book2 = new Book07("7145", "Hafalah Shalat Delisa");
        Book07 book3 = new Book07("2562", "Muhammad Al-Fatih");
        
        Stack<Book07> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book07 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book07 temp2 = books.pop();

        if (temp2 != null) {
            System.out.println(temp2.toString());

        for (Book07 book : books) {
            System.out.println(book.toString());    
        }
        System.out.println(books);

        books.search(book1);
        }
    }
}