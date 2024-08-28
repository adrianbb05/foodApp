package com.batista.foodapp.model.impl;

import java.sql.Date;
import java.util.Set;

import com.batista.foodapp.model.ShoppingList;
import com.batista.foodapp.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Users")
@RequiredArgsConstructor
@NoArgsConstructor
public class UserImpl implements User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String lastName;
    private Date birthDay;
    @OneToOne
    private ShoppingListImpl shoppingListImpl;
    @OneToMany
    private Set<RecipeImpl> recipesImpl;

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
        return shoppingListImpl;
    }

    @Override
    public void setShoppingList(ShoppingListImpl shoppingListImpl) {
        this.shoppingListImpl = shoppingListImpl;
    }

    @Override
    public Set<RecipeImpl> getRecipes() {
        return recipesImpl;
    }

    @Override
    public void setRecipes(Set<RecipeImpl> recipeImpl) {
        this.recipesImpl = recipeImpl;
    }
}
