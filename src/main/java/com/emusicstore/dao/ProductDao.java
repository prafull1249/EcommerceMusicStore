package com.emusicstore.dao;

import com.emusicstore.model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prafull on 1/22/2017.
 */
public class ProductDao {

    private List<Product> productList;

    public Product getProductById(String Id) throws IOException{

        for(Product prod: getProductList()){
            if(prod.getProductId().equals(Id)){
                return prod;
            }
        }

        throw new IOException();
    }

    public List<Product> getProductList(){
        Product product1 = new Product();

        product1.setProductId("1");
        product1.setProductName("Guitar1");
        product1.setProductCategory("Instrument");
        product1.setProductDescription("Fender Strat Guitar");
        product1.setProductPrice(1200);
        product1.setProductStatus("Active");
        product1.setProductCondition("new");
        product1.setProductManufacturer("Fender");
        product1.setUnitInStock(11);

        Product product2 = new Product();

        product2.setProductId("2");
        product2.setProductName("Record1");
        product2.setProductCategory("Record");
        product2.setProductDescription("Mixer of the 20th Century");
        product2.setProductPrice(25);
        product2.setProductStatus("Active");
        product2.setProductCondition("new");
        product2.setProductManufacturer("EMI");
        product2.setUnitInStock(133);


        Product product3 = new Product();

        product3.setProductId("3");
        product3.setProductName("Speaker1");
        product3.setProductCategory("Accessory");
        product3.setProductDescription("JBL's Loudest and finest speakers");
        product3.setProductPrice(25);
        product3.setProductStatus("Active");
        product3.setProductCondition("new");
        product3.setProductManufacturer("JBL");
        product3.setUnitInStock(45);


        productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        return productList;
    }
}
