package com.example.boghandel.model;

public class Vare {
    int id;
    String name;
    String genre;
    double price;

   public Vare(int id, String name, String genre, double price) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
