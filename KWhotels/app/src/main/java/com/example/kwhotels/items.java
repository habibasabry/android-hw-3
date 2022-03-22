package com.example.kwhotels;

public class items {
    private String itemName;
    private int itemImg;
    private double itemPrice;


    public items(String itemName, int itemImg, double itemPrice) {
        this.itemName = itemName;
        this.itemImg = itemImg;
        this.itemPrice = itemPrice;
    }


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
}
