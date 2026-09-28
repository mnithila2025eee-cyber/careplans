package com.library.librarymanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EBookLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookTitle;

    private String publisher;

    private int concurrentLimit;

    private int currentCheckouts;

    private double licenseCost;

    public EBookLicense() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getConcurrentLimit() {
        return concurrentLimit;
    }

    public void setConcurrentLimit(int concurrentLimit) {
        this.concurrentLimit = concurrentLimit;
    }

    public int getCurrentCheckouts() {
        return currentCheckouts;
    }

    public void setCurrentCheckouts(int currentCheckouts) {
        this.currentCheckouts = currentCheckouts;
    }

    public double getLicenseCost() {
        return licenseCost;
    }

    public void setLicenseCost(double licenseCost) {
        this.licenseCost = licenseCost;
    }
}
