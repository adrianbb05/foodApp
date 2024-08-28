package com.batista.foodapp.model;

import java.util.Set;

import com.batista.foodapp.model.impl.ShoppingListProductImpl;

public interface ShoppingList {

    public String getName();

    public void setName(String name);

    Set<ShoppingListProductImpl> getProducts();

    public void setProducts(Set<ShoppingListProductImpl> products);

}
