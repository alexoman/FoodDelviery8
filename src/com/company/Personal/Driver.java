package com.company.Personal;

public class Driver extends Person {
    private int starsrating;

    public Driver(String lastName, String firstName, int age, int starsrating) {
        super(lastName,firstName,age);
        this.starsrating = starsrating;
    }

    public int getStarsrating() {
        return starsrating;
    }

    public void setStarsrating(int starsrating) {
        this.starsrating = starsrating;
    }
}
