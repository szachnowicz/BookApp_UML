package com.company;

import com.company.entities.Book;
import com.company.entities.TitleBook;

public class Factory {
    // static final long day = 24 * 60 * 60 * 1000; //kolejne iteracje
    public TitleBook createTitleBook(String data[]) { //1-a iteracja
        TitleBook titleBook = null;
        switch (Integer.parseInt(data[0])) //what_title_book_type
        {
            case 0:
                titleBook = new TitleBook(); //TTitle_book object for searching
                titleBook.setISBN(data[1]);
                break;
            case 1:
                titleBook = new TitleBook(); //TTitle_book object for persisting
                titleBook.setAuthor(data[1]);
                titleBook.setTitle(data[2]);
                titleBook.setISBN(data[3]);
                titleBook.setPublisher(data[4]);
                break;
        }
        return titleBook;
    }

    public Book create_book(String data[]) {
        Book book = null;
        switch (Integer.parseInt(data[0])) //what_book_type
        {
            case 0:
                book = new Book();          //Book object for persisting
                book.setNumber(Integer.parseInt(data[1]));
                break;
        }
        return book;
    }

}