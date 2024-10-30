package com.batista.foodapp.model;

import java.sql.Date;
import java.util.Set;

import com.batista.foodapp.model.recipe.Recipe;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String lastName;
    private Date birthDay;
    @OneToOne
    private ShoppingList shoppingListImpl;
    @OneToMany
    private Set<Recipe> recipesImpl;

}
