package com.vish.java;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private int mId;
    private String mName;
    private ProductCategory mProductCategory;
    private List<ProductCategory> mProductCategoryList;

    public Stock(int id, String name){
        mId = id;
        mName = name;

        mProductCategoryList = new ArrayList<>();
    }

    public void add(ProductCategory productCategory){
        mProductCategoryList.add(productCategory);
    }

    public String remove(int productCategoryPosition){
        mProductCategoryList.remove(productCategoryPosition);

        return mProductCategoryList.get(productCategoryPosition).getName();
    }
}
