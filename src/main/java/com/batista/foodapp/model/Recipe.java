package com.batista.foodapp.model;

import java.sql.Time;
import java.util.List;
import java.util.Set;

public interface Recipe {

    String getName();

    void setName(String name);

    List<RecipeProduct> getIngredients();

    void setIngredients(List<RecipeProduct> ingredients);

    List<Step> getSteps();

    void setSteps(List<Step> steps);

    Set<String> getCategories();

    void setCategories(Set<String> categories);

    Time getTime();

    void setTime(Time time);

    Long getId();
}
