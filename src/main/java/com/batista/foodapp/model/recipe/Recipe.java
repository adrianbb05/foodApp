package com.batista.foodapp.model.recipe;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import com.batista.foodapp.model.products.Categories;
import com.batista.foodapp.model.User;
import com.batista.foodapp.model.products.RecipeProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "Recipe")
public class Recipe {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Time time;
    @OneToMany
    private List<RecipeProduct> ingredients;
    @OneToMany
    private List<Step> steps;
    @OneToMany
    private Set<Categories> categories;

    @JsonIgnore
    @ManyToOne
    private User user;

}
