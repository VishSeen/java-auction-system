package com.vish.java;

public class User {
    private int mId;
    private String mName;
    private String mPass;
    private Bid mBid;


    public User(int id, String name){
        mId = id;
        mName = name;
    }

    public User(int id, String name, String pass){
        mId = id;
        mName = name;
        mPass = pass;
    }

    public void placeBid(Bid bid){
        mBid = bid;
    }


    // GETTERS and SETTERS
    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getPass() {
        return mPass;
    }

    public Bid getBid() {
        return mBid;
    }

    public void setId(int id) {
        mId = id;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setPass(String pass) {
        mPass = pass;
    }

    public void setBid(Bid bid) {
        mBid = bid;
    }
}
