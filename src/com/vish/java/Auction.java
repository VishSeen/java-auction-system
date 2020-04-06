package com.vish.java;

import java.util.List;

public class Auction {
    private int mId;
    private Bid mStartBid;
    private double mStartPrice;
    private double mEndPrice;
    private Bid mWinningBid;
    private List<Bid> mAllBids;
    private User mWinningUser;


    public Auction(int id, Bid bid, List<Bid> biddingList){
        mId = id;
        mStartBid = bid;
        mStartPrice = mStartBid.getAmount();
        mEndPrice = mStartPrice;
        mAllBids = biddingList;
    }

    public void addBid(Bid bid){
        mAllBids.add(bid);
    }

    public void removeBid(Bid bid){
        mAllBids.remove(bid);
    }

    public void calculateWinner(List<Bid> biddingList){
        for (Bid bid : biddingList) {
            if (bid.getAmount() > mEndPrice) {
                mEndPrice = bid.getAmount();
                mWinningBid = bid;
                mWinningUser = bid.getUser();
            }
        }
    }


    // GETTERS and SETTERS
    public int getId() {
        return mId;
    }

    public Bid getStartBid() {
        return mStartBid;
    }

    public double getStartPrice() {
        return mStartPrice;
    }

    public double getEndPrice() {
        return mEndPrice;
    }

    public Bid getWinningBid() {
        return mWinningBid;
    }

    public User getWinningUser() {
        return mWinningUser;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public void setStartBid(Bid startBid) {
        mStartBid = startBid;
    }

    public void setStartPrice(double startPrice) {
        mStartPrice = startPrice;
    }

    public void setEndPrice(double endPrice) {
        mEndPrice = endPrice;
    }

    public void setWinningBid(Bid winningBid) {
        mWinningBid = winningBid;
    }

    public void setWinningUser(User winningUser) {
        mWinningUser = winningUser;
    }
}
