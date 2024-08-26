package com.batista.foodapp.model.impl;

import java.util.Set;

import com.batista.foodapp.model.ShoppingList;
import com.batista.foodapp.model.ShoppingListProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ShoppingList")
public class ShoppingListImpl implements ShoppingList {

    @Id
    private Long id;
    private String name;
    @OneToMany
    private Set<ShoppingListProductImpl> products;

    @JsonIgnore
    @ManyToOne
    private UserImpl userImpl;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Set<ShoppingListProduct> getProducts() {
        return products;
    }

    @Override
    public void setProducts(Set<ShoppingListProduct> products) {
        this.products = products;
    }
}
