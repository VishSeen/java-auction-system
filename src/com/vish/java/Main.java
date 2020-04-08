package com.vish.java;

import com.vish.java.inventory.Product;

import java.util.*;

public class Main {
    private static List<Bid> bidList;

    public static void main(String[] args) {

        setUpUi();



        // create list to hold bids
        bidList = new ArrayList<>();

        // an owner for the bid
        User admin = new User(1, "shane");

	    // create a product to use and assign user as owner
        Product apple = new Product(25, "Apple", 1, admin);

        // a starting bid for auctionned product
        Bid startBid = new Bid(001, apple, 100,  admin);

        // add bid to list
        bidList.add(startBid);

        // start auction ceremony
        Auction auction = new Auction(1, startBid, bidList);


        // user bidding
        User userOne = new User(13, "Vish");
        Bid userOneBid = new Bid(03, apple, 150, userOne);
        userOne.placeBid(userOneBid);

        User userTwo = new User(16, "Kriti");
        Bid userTwoBid = new Bid(04, apple, 250, userTwo);
        userTwo.placeBid(userTwoBid);

        User userThree = new User(16, "Tej");
        Bid userThreeBid = new Bid(04, apple, 450, userThree);
        userTwo.placeBid(userTwoBid);

        // add new bidder
        bidList.add(userOneBid);
        bidList.add(userTwoBid);
        bidList.add(userThreeBid);


        // print all user in the bidding list including admin
        for(int i = 0; i <= bidList.size() - 1; i++){
            System.out.println(bidList.get(i).getUser().getName() + " : " + bidList.get(i).getAmount());
        }

        auction.calculateWinner(bidList);

        System.out.println("---------------------------");
        System.out.println("Winner is " + auction.getWinningUser().getName() + " with winning bid : " + auction.getWinningBid().getAmount());


    }


    public static void setUpUi(){
        System.out.println("-------------------------------------");
        System.out.println("            AUCTION SYSTEM           ");
        System.out.println("-------------------------------------");

        System.out.println("Welcome to our auction room.");
        System.out.println("Use the number to pass in the commands.");
        System.out.println(" ");

        System.out.println("Commands :");
        System.out.println("1. Login");
        System.out.println("2. Find auctions");
        System.out.println("3. Exit");

        System.out.println("-------------------------------------");

    }
}
