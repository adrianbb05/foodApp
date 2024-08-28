package com.batista.foodapp.model;

public interface ShoppingListProduct extends Product {

    String getName();

    void setName(String name);

    String getShop();

    void setShop(String shop);

    String getNote();

    void setNote(String note);

    boolean isPurchased();

    void setPurchased(boolean purchased);
}