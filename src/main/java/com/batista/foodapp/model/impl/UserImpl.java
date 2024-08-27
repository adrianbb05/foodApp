package com.batista.foodapp.model.impl;

import java.sql.Date;
import java.util.Set;

import com.batista.foodapp.model.Recipe;
import com.batista.foodapp.model.ShoppingList;
import com.batista.foodapp.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Users")
@RequiredArgsConstructor
public class UserImpl implements User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private final Long id;
    private String username;
    private String lastName;
    private Date birthDay;
    @OneToMany
    private ShoppingList shoppingList;
    @OneToMany
    private Set<Recipe> recipes;

    public UserImpl(Long id) {

        this.id = id;
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public void setName(String name) {
        this.username = name;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public Date getBirthDate() {
        return birthDay;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.birthDay = birthDate;
    }

    @Override
    public ShoppingList getShoppingList() {
        return shoppingList;
    }

    @Override
    public void setShoppingList(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    @Override
    public Set<Recipe> getRecipes() {
        return recipes;
    }

    @Override
    public void setRecipes(Set<Recipe> recipe) {
        this.recipes = recipe;
    }
}
