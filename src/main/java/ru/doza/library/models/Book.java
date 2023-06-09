package ru.doza.library.models;

import javax.validation.constraints.*;

public class Book {
    private int id;

    @NotEmpty(message = "Name cant be empty")
    @Size(min = 2, max = 50, message = "Name should be 2 - 50 charters")
    private String title;

    @NotEmpty(message = "Author cant be empty")
    @Size(min = 2, max = 50, message = "Author name should be 5 - 50 charters")
    private String author;

    @Min(value = 1500, message = "Year should be > than 1500")
    private int year;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}