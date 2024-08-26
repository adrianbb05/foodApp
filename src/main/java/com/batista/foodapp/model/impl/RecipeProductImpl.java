package com.batista.foodapp.model.impl;

import com.batista.foodapp.model.AbstractProduct;
import com.batista.foodapp.model.MeasurementUnit;
import com.batista.foodapp.model.RecipeProduct;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "RecipeProduct")
public class RecipeProductImpl extends AbstractProduct implements RecipeProduct {

    @Id
    private Long id;
    private MeasurementUnit measurementUnit;

    @JsonIgnore
    @ManyToOne
    private RecipeImpl recipe;

    @Override
    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    @Override
    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }
}
