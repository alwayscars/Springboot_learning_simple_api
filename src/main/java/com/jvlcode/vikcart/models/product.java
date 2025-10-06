package com.jvlcode.vikcart.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="products")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for ratings
    public double getRatings() {
        return ratings;
    }
    public void setRatings(double ratings) {
        this.ratings = ratings;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    // Getter and Setter for seller
    public String getSeller() {
        return seller;
    }
    public void setSeller(String seller) {
        this.seller = seller;
    }

    // Getter and Setter for stock
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    // Getter and Setter for numOfReviews
    public int getNumOfReviews() {
        return numOfReviews;
    }
    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }
    private String name;
    private double price;

    private String description;
    private double ratings;
    private String category;
    private String seller;
    private int stock;
    private int numOfReviews;
    @ElementCollection
    private List<String> images;

    public product(String name, double price, String description, double ratings, String category, String seller,
                   int stock, int numOfReviews) {
        super();
        this.name = name;
        this.price = price;
        this.description = description;
        this.ratings = ratings;
        this.category = category;
        this.seller = seller;
        this.stock = stock;
        this.numOfReviews = numOfReviews;
    }
    public product() {
        super();
    }
}
