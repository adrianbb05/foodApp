package com.batista.foodapp.model.impl;

import java.sql.Date;
import java.util.Set;

import com.batista.foodapp.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class UserImpl implements User {

    @Id
    private Long id;
    private String username;
    private String lastName;
    private Date birthDay;
    @OneToOne
    private ShoppingListImpl shoppingList;
    @OneToMany
    private Set<RecipeImpl> recipes;

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
}
