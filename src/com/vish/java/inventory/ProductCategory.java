package com.vish.java.inventory;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {
    private int mId;
    private String mName;
    private String mDescription;
    private List<Product> mProductList;


    public ProductCategory(int id, String name, String description){
        mId = id;
        mName = name;
        mDescription = description;

        mProductList = new ArrayList<Product>();
    }

    public void add(Product product){
        mProductList.add(product);
    }

    public String remove(int productPosition){
        mProductList.remove(productPosition);

        return mProductList.get(productPosition).getName();
    }


    // GETTTERS and SETTERS
    public int getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }
    public List<Product> getProductList() {
        return mProductList;
    }


    public void setId(int id) {
        mId = id;
    }

    public void setName(String name) {
        mName = name;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public void setProductList(List<Product> productList) {
        mProductList = productList;
    }
}
