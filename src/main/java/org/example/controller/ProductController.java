package org.example.controller;

import net.minidev.json.JSONObject;
import org.example.model.Product;
import org.example.service.ProductList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductList ProductList;

    @PostMapping("/items")
    public HttpStatus createItem(@RequestBody JSONObject object) {
        ProductList.addProduct(object.getAsString("name"));
        return HttpStatus.OK;
    }

    @GetMapping("/items")
    public Iterable<Product> getAll() { return ProductList.getAll(); }

    @PutMapping("/items/{id}")
    public HttpStatus PurchasedItem(@PathVariable int id) {
        ProductList.Purchased(id);
        return HttpStatus.OK;
    }
    @DeleteMapping("/items/{id}")
    public HttpStatus deleteItem(@PathVariable int id) {
        ProductList.deleteProduct(id);
        return HttpStatus.OK;
    }
}
