package com.batista.foodapp.model.impl;

import java.util.Set;

import com.batista.foodapp.model.ShoppingList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "ShoppingList")
@RequiredArgsConstructor
@NoArgsConstructor
public class ShoppingListImpl implements ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public Set<ShoppingListProductImpl> getProducts() {
        return products;
    }

    @Override
    public void setProducts(Set<ShoppingListProductImpl> products) {
        this.products = products;
    }
}
