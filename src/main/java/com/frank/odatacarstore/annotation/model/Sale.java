package com.frank.odatacarstore.annotation.model;

public class Sale{


    private User seller;
    private User buyer;
    private double price;
    private Car car;

    public Sale(){}

    public Sale(User seller, User buyer, double price, Car car) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.car = car;
    }

    public User getSeller() {
        return seller;
    }

    public User getBuyer() {
        return buyer;
    }

    public double getPrice() {
        return price;
    }

    public Car getCar() {
        return car;
    }
}