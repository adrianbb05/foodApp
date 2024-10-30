package com.batista.foodapp.model.products;

import com.batista.foodapp.model.recipe.Recipe;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table (name = "RecipeProduct")
public class RecipeProduct extends AbstractProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private MeasurementUnit measurementUnit;

    @JsonIgnore
    @ManyToOne
    private Recipe recipe;

}
