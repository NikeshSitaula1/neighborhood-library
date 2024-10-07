package com.pluralsight;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkOutTo;

    public Book(int id, String title, String isbn) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;

        this.isCheckedOut = false;
        this.checkOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getISBN() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckOutTo() {
        return checkOutTo;
    }

    public void checkOut(String name){
        this.checkOutTo = name;
        this.isCheckedOut = true;
    }

    public void checkIn(){
        this.checkOutTo = "";
        this.isCheckedOut = false;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkOutTo='" + checkOutTo + '\'' +
                '}';
    }
}
