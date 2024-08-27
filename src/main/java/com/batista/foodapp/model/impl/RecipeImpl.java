package com.batista.foodapp.model.impl;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import com.batista.foodapp.model.Recipe;
import com.batista.foodapp.model.RecipeProduct;
import com.batista.foodapp.model.Step;
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
@Table (name = "Recipe")
@NoArgsConstructor
public class RecipeImpl implements Recipe  {

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
    private Set<String> categories;

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
    public List<RecipeProduct> getIngredients() {
        return ingredients;
    }

    @Override
    public void setIngredients(List<RecipeProduct> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public List<Step> getSteps() {
        return steps;
    }

    @Override
    public void setSteps(List<Step> steps) {
        this.steps = steps;
    }

    @Override
    public Set<String> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    @Override
    public Time getTime() {
        return time;
    }

    @Override
    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public Long getId() {
        return id;
    }

}
