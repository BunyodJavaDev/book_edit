package model;

import database.Database;

import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private UUID id;
    private String title;
    private String author;
    private String description;
    private Double price;
    private Integer bookCount;
    private LocalDate creationDate;

    public Book() {
    }

    public Book(String title, String author, String description, Double price, Integer bookCount) {
        id = UUID.randomUUID();
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.bookCount = bookCount;
        this.creationDate = LocalDate.now();
    }

    public UUID getId() {
        return id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }


    public String publicInfo(){
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\''+
                '}';
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", bookCount=" + bookCount +
                ", creationDate=" + creationDate +
                '}';
    }
}
