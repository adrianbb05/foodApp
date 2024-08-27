package com.batista.foodapp.model;

import java.sql.Date;
import java.util.Set;

public interface User {

    String getName();

    void setName(String name);

    String getLastName();

    void setLastName(String lastName);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    ShoppingList getShoppingList();

    void setShoppingList(ShoppingList shoppingList);

    Set<Recipe> getRecipes();

    void setRecipes(Set<Recipe> recipe);
}
