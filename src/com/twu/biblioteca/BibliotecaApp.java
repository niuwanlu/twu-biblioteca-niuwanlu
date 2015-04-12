package com.twu.biblioteca;

public class BibliotecaApp {

    private Book[] books;

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void showWelcome() {
        System.out.println("Welcome!");
        System.out.println("=======================");
    }

    public void printBookList() {
        Book[] books = getBooks();
        System.out.println("=======Book List=======");
        for (Book book : books ) {
            System.out.print("Book Name: " + book.getName() + "  ");
            System.out.print("Author:  " + book.getAuthor() + "  ");
            System.out.println("Published Year: " + book.getYearPublished());
        }
    }

    public void showOptions() {
        System.out.println("Please choose an option:\n1.List Books");
    }

}
