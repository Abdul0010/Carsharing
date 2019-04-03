package com.example.abdulqader.alfalzah.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity
public class cars {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String owner;
    private String    number_of_passenger;
    private String date;
    private String time;
    private String price;
    private String contact;
    private String from;
    private String to;
    private String status;

    public cars(@NonNull int id, String owner, String number_of_passenger, String date, String time, String price, String contact, String from, String to, String status) {
        this.id = id;
        this.owner = owner;
        this.number_of_passenger = number_of_passenger;
        this.date = date;
        this.time = time;
        this.price = price;
        this.contact = contact;
        this.from = from;
        this.to = to;
        this.status = status;
    }

    public cars() {

    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber_of_passenger() {
        return number_of_passenger;
    }

    public void setNumber_of_passenger(String number_of_passenger) {
        this.number_of_passenger = number_of_passenger;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
