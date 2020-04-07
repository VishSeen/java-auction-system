package com.vish.java;

import com.vish.java.inventory.Product;

public class Bid {
    private int mId;
    private Product mProduct;
    private double mAmount;
    private Auction mAuction;
    private User mUser;


    public Bid(int id, Product product){
        mId = id;
        mProduct = product;
    }

    // use for bidder
    public Bid(int id, Product product, double amount, User user){
        mId = id;
        mProduct = product;
        mAmount = amount;
        mUser = user;
    }


    // GETTERS and SETTERS
    public int getId() {
        return mId;
    }

    public double getAmount() {
        return mAmount;
    }

    public Product getProduct() {
        return mProduct;
    }

    public User getUser() {
        return mUser;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }

    public void setProduct(Product product) {
        mProduct = product;
    }
    public void setUser(User user) {
        mUser = user;
    }
}
