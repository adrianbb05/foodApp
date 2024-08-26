package com.batista.foodapp.model;

import java.util.Set;

public interface ShoppingList {

    public String getName();

    public void setName(String name);

    Set<ShoppingListProduct> getProducts();

    public void setProducts(Set<ShoppingListProduct> products);

}
