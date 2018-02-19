package com.company.entities;

import com.company.Factory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class TitleBook {
    private String publisher;
    private String ISBN;
    private String title;
    private String author;
    List<Book> bookList;

    public TitleBook() {
        bookList = new ArrayList();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (getISBN().equals(((TitleBook) obj).getISBN()))
            result = true;
        return result;
    }

    @Override
    public String toString() {
        String help = "\nTitle: " + getTitle();
        help += " Author: " + getAuthor();
        help += " ISBN: " + getISBN();
        help += " Publisher: " + getPublisher();
        return help;
    }

    public ArrayList<String> addBook(String data[]) {
        Factory factory = new Factory();
        Book newbook;
        newbook = factory.create_book(data);
        if (searchForBook(newbook) == null) {
            bookList.add(newbook);
            newbook.setTitleBook(this);
            return getBooksList();
        }
        return null;
    }

    public Book searchForBook(Book book) {
        int idx = bookList.indexOf(book);
        if (idx != -1) {
            book = bookList.get(idx);
            return book;
        }
        return null;
    }

    public ArrayList<String> getBooksList() {
        ArrayList<String> titleBooks = new ArrayList<>();
        Iterator<Book> help = bookList.iterator();
        while (help.hasNext()) {
            Book next = help.next();
            titleBooks.add(next.toString());
        }
        return titleBooks;
    }


    /*
    Seters and getters
     */
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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

}