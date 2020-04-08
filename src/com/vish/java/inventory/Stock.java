package com.vish.java.inventory;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private int mId;
    private String mName;
    private String mDescription;
    private List<Product> mProductList;
    private ProductCategory mProductCategory;

    private List<ProductCategory> mProductCategoryList;


    public Stock(){
        mProductList = new ArrayList<>();
    }

    public Stock(int id, String name, String description){
        mId = id;
        mName = name;
        mDescription = description;
    }

    public Stock(int id, String name, String description, List<ProductCategory> productCategoryList){
        mId = id;
        mName = name;
        mDescription = description;
        mProductCategoryList = productCategoryList;
    }


    public void addProduct(Product product){
        mProductList.add(product);
    }

    public String removeProduct(Product product){
        for(int i = 0; i < mProductList.size(); i++){
            if(mProductList.get(i) == product) {
                mProductList.remove(i);
                return product.getName();
            }
        }

        return "Does not exist";
    }

    public void addProductCategory(ProductCategory productCategory){
        mProductCategory = productCategory;
    }

    public void addProductCategory(ProductCategory productCategory, Product product){
        mProductCategory = productCategory;
        mProductCategory.add(product);
    }
}
