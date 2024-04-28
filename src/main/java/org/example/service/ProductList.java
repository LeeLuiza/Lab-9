package org.example.service;

import org.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductList {
    private final ArrayList<Product> list = new ArrayList<Product>(){};
    private int count = 0;

    public ArrayList<Product> getAll() {
        return list;
    }

    public Product addProduct(String name) {
        Product product = new Product(count, name);
        count++;
        list.add(product);
        return product;
    }

    public Product getProduct(int id){
        for (Product product: list) {
            if(product.getId() == id)
                return product;
        }
        return null;
    }
    public void Purchased(int id) {
        getProduct(id).setPurchased();
    }

    public void deleteProduct(int id) {
        list.remove(getProduct(id));
    }
}
