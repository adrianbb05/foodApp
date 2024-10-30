package com.batista.foodapp.model.products;

public abstract class AbstractProduct implements Product {


    private String name;
    private int amount;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int price) {
        this.amount = price;
    }
}
