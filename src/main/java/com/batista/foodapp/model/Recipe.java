package com.batista.foodapp.model;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import com.batista.foodapp.model.impl.CategoriesImpl;
import com.batista.foodapp.model.impl.RecipeProductImpl;
import com.batista.foodapp.model.impl.StepImpl;

public interface Recipe {

    String getName();

    void setName(String name);

    List<RecipeProductImpl> getIngredients();

    void setIngredients(List<RecipeProductImpl> ingredients);

    List<StepImpl> getSteps();

    void setSteps(List<StepImpl> steps);

    Set<CategoriesImpl> getCategories();

    void setCategories(Set<CategoriesImpl> categories);

    Time getTime();

    void setTime(Time time);

    Long getId();
}
