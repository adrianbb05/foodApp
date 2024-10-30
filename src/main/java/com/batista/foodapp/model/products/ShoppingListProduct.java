package com.batista.foodapp.model.products;

import com.batista.foodapp.model.ShoppingList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "ShoppingListProducts")
@RequiredArgsConstructor
@NoArgsConstructor
public class ShoppingListProduct extends AbstractProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shop;
    private String note;
    private boolean purchased = false;

    @JsonIgnore
    @ManyToOne
    private ShoppingList shoppingList;

}
