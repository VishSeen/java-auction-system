package com.vish.java;

public class Product {
    private int mId;
    private String mName;
    private int mQuantity;
    private User mOwner;

    public Product(int id, String name, int quantity){
        mId = id;
        mName = name;
        mQuantity = quantity;
    }

    public Product(int id, String name, int quantity, User owner){
        mId = id;
        mName = name;
        mQuantity = quantity;
        mOwner = owner;
    }


    // GETTERS and SETTERS
    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public int getQuantity() {
        return mQuantity;
    }

    public User getOwner() {
        return mOwner;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setQuantity(int quantity) {
        mQuantity = quantity;
    }

    public void setOwner(User owner) {
        mOwner = owner;
    }
}
