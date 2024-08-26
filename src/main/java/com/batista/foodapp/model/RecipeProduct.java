package com.batista.foodapp.model;

public interface RecipeProduct extends Product {

    MeasurementUnit getMeasurementUnit();

    void setMeasurementUnit(MeasurementUnit measurementUnit);
}
