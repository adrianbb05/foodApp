package com.batista.foodapp.model.impl;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import com.batista.foodapp.model.Recipe;
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
@RequiredArgsConstructor
@NoArgsConstructor
public class RecipeImpl implements Recipe  {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Time time;
    @OneToMany
    private List<RecipeProductImpl> ingredients;
    @OneToMany
    private List<StepImpl> steps;
    @OneToMany
    private Set<CategoriesImpl> categories;

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
    public List<RecipeProductImpl> getIngredients() {
        return ingredients;
    }

    @Override
    public void setIngredients(List<RecipeProductImpl> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public List<StepImpl> getSteps() {
        return steps;
    }

    @Override
    public void setSteps(List<StepImpl> steps) {
        this.steps = steps;
    }

    @Override
    public Set<CategoriesImpl> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(Set<CategoriesImpl> categories) {
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
