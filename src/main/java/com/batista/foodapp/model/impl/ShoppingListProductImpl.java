package com.batista.foodapp.model.impl;

import com.batista.foodapp.model.AbstractProduct;
import com.batista.foodapp.model.ShoppingListProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ShoppingListProducts")
public class ShoppingListProductImpl extends AbstractProduct implements ShoppingListProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shop;
    private String note;
    private boolean purchased = false;

    @JsonIgnore
    @ManyToOne
    private ShoppingListImpl shoppingList;

    @Override
    public String getShop() {
        return shop;
    }

    @Override
    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public String getNote() {
        return note;
    }

    @Override
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean isPurchased() {
        return purchased;
    }

    @Override
    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

}
