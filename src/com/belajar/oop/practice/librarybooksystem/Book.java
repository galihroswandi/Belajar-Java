package com.belajar.oop.practice.librarybooksystem;

public class Book {
    private long isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(long isbn, String title, String author, boolean available) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    // Getters and Setters
    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
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

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getAvailable() {
        return available;
    }

    public String formatISBN(String isbn) {
        String cleanISBN = isbn.replaceAll("\\D", "");

        if (cleanISBN.length() != 13) {
            throw new IllegalArgumentException("ISBN harus 13 digit!");
        }

        return cleanISBN.replaceAll("(\\d{3})(\\d{1})(\\d{5})(\\d{1})(\\d{3})", "$1-$2-$3-$4-$5");
    }
}
