package com.company.Places;

public class Food implements Comparable<Food> {
    private String name;
    private int price;
    private String[] ingredients;
    private String[] vitamins;

    public Food(String name, int price, String[] ingredients, String[] vitamins) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.vitamins = vitamins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getVitamins() {
        return vitamins;
    }

    public void setVitamins(String[] vitamins) {
        this.vitamins = vitamins;
    }


    @Override
    public int compareTo(Food f) {
        return this.price-f.price;
    }
}
