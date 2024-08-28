package com.batista.foodapp.model;

import java.sql.Date;
import java.util.Set;

import com.batista.foodapp.model.impl.RecipeImpl;
import com.batista.foodapp.model.impl.ShoppingListImpl;

public interface User {

    String getName();

    void setName(String name);

    String getLastName();

    void setLastName(String lastName);

    Date getBirthDate();

    void setBirthDate(Date birthDate);

    ShoppingList getShoppingList();

    void setShoppingList(ShoppingListImpl shoppingListImpl);

    Set<RecipeImpl> getRecipes();

    void setRecipes(Set<RecipeImpl> recipe);
}
