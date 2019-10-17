package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=1)
    private String title;

    @NotNull
    @Size(min=3)
    private String description;

    @NotNull
    @Size(min=1)
    private String author;

    @NotNull
    @Size(min=10, max=12)
    private String phoneNumber;

    @NotNull
    private LocalDate postedDate;

    @NotNull
    private LocalTime postedTime;

    public Job() {
    }

    public Job(@NotNull @Size(min = 1) String title, @NotNull @Size(min = 3) String description, @NotNull @Size(min = 1) String author, @NotNull @Size(min = 10, max = 12) String phoneNumber, @NotNull LocalDate postedDate, @NotNull LocalTime postedTime) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.phoneNumber = phoneNumber;
        this.postedDate = postedDate;
        this.postedTime = postedTime;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(LocalDate postedDate) {
        this.postedDate = LocalDate.now();
    }

    public LocalTime getPostedTime() {
        return postedTime;
    }

    public void setPostedTime(LocalTime postedTime) {
        this.postedTime = LocalTime.now();
    }
}


