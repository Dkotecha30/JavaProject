// Book program to represent a book with its details using mutator
import java.io.*;
import java.util.*;

class Book {
    private String name;
    private int isbn;
    private String author;
    private String publisher;

    public Book() {
        name = "NULL";
        isbn = 0;
        author = "NULL";
        publisher = "NULL";
    }

    public Book(String name, int isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public int getISBN() {
        return isbn;
    }

    public void setAuth(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        String info = "Name"+ name+"ISBN number"+isbn+"Author"+author+"Publisher"+publisher;
        return info;
    }
}

