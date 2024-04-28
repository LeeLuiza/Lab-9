package org.example.model;

public class Product {
    private int id;
    private String name;
    private boolean purchased;

    public Product(int id, String currentProductName){
        this.id=id;
        name=currentProductName;
        this.purchased=false;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean getPurchased() {
        return purchased;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPurchased() {
        purchased = !purchased;
    }
}
