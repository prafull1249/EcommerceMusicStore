package com.emusicstore.controller;

import com.emusicstore.dao.ProductDao;
import com.emusicstore.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

/**
 * Created by Prafull on 1/22/2017.
 */

@Controller
public class HomeController {

    ProductDao productDao = new ProductDao();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/productList")
    public String getProducts(Model model){

        List<Product> products = productDao.getProductList();
        model.addAttribute("products",products );
        return "productList";

    }
    @RequestMapping("/productList/viewProduct/{productId}")
    public String viewProduct(@PathVariable String productId, Model model){

        Product product = null;
        try {
            product = productDao.getProductById(productId);
        } catch (IOException e) {
            System.out.println("Cannot find the product with ID "+ productId);
        }
        model.addAttribute(product);
        return "viewProduct";
    }

}
