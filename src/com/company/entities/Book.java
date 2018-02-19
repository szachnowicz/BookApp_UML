package com.company.entities;


public class Book {
    private int number;
    private TitleBook titleBook;

    public Book() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TitleBook getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(TitleBook titleBook) {
        this.titleBook = titleBook;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != 0 ? number : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        return number == ((Book) obj).getNumber();
    }

    @Override
    public String toString() {
        String help = titleBook.toString();
        help += " Number: " + getNumber();
        return help;
    }

 /* public Date getPeriod() { //kolejne iteracje
 throw new UnsupportedOperationException("Not supported yet."); }
 public void setPeriod(Date period) { }
 */
}