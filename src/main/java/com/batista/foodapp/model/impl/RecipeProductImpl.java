package com.batista.foodapp.model.impl;

import com.batista.foodapp.model.AbstractProduct;
import com.batista.foodapp.model.MeasurementUnit;
import com.batista.foodapp.model.RecipeProduct;
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
@Table (name = "RecipeProduct")
@RequiredArgsConstructor
@NoArgsConstructor
public class RecipeProductImpl extends AbstractProduct implements RecipeProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
