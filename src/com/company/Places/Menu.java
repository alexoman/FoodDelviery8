package com.company.Places;

import java.util.List;

public class Menu {

    private List<Food> foods;

    public Menu (List<Food> foods) {
        this.foods = foods;
    }


    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}
