package com.example.BtsShow.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "shows")
public class Show {
    @Id
    private int show_id;
    private String location;
    private String date;
    private int avaliable_tickets;

    public Show(int show_id, String location, String date, int avaliable_tickets) {
        this.show_id = show_id;
        this.location = location;
        this.date = date;
        this.avaliable_tickets = avaliable_tickets;
    }

    public int getShow_id() {
        return show_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvaliable_tickets() {
        return avaliable_tickets;
    }

    public void setAvaliable_tickets(int avaliable_tickets) {
        this.avaliable_tickets = avaliable_tickets;
    }
}