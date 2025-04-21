package com.pluralsight;

public class Book {

    private int id;
    private double isbn;
    private String title;
    private boolean checkOut;
    private  boolean checkIn;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public Book(int id, double isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.id = id;
        this.checkedOutTo = "";
        this.isCheckedOut = false;
    }

    public int getId() {
        return id;
    }

    public double getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }


    public void setId(int id) {
        this.id = id;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    public boolean isCheckIn() {
        return checkIn;
    }

    public void setCheckIn(boolean checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
