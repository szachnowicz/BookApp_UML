package com.company;

import com.company.entities.TitleBook;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    List<TitleBook> titleBooksList;

    public Facade() {
        titleBooksList = new ArrayList<>();
    }

    public List<TitleBook> getTitleBooksList() {
        return titleBooksList;
    }

    public TitleBook searchTitleBook(TitleBook titleBook) {
        int index = titleBooksList.indexOf(titleBook);
        if (index != -1) {
            titleBook = titleBooksList.get(index);
            return titleBook;
        }
        return null;
    }

    public String addTitleBook(String data[]) {
        Factory factory = new Factory();
        TitleBook book = factory.createTitleBook(data);
        if (searchTitleBook(book) == null) {
            titleBooksList.add(book);
            return book.toString();
        }
        return null;
    }

    public ArrayList<String> addBook(String data1[], String data2[]) {
        TitleBook tempBook, titleExist;
        Factory factory = new Factory();

        tempBook = factory.createTitleBook(data1);
        titleExist = searchTitleBook(tempBook);

        if (titleExist != null) {
            return titleExist.addBook(data2);
        }
        return null;
    }
}
