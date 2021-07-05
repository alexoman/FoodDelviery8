package com.company.Places;

import com.company.Anything.Adress;

public class Place {
    private static int ct = 0;
    private int placeId;
    private String name;
    private int reviewstars;
    private Menu menu;

    Adress adress;

    public Place(String name, int reviewstars, Menu menu, Adress adress) {
        this.name = name;
        this.reviewstars = reviewstars;
        this.menu = menu;
        this.adress = adress;
    }

    {
        ct++;
        this.placeId = ct++;
    }

    public int getPlaceId() {
        return placeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReviewstars() {
        return reviewstars;
    }

    public void setReviewstars(int reviewstars) {
        this.reviewstars = reviewstars;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Place{" +
                "placeId=" + placeId +
                ", name='" + name + '\'' +
                ", stars=" + reviewstars +
                ", city=" + adress.getCity() +
                ", street=" + adress.getStreetName() +
                ", letter=" + adress.getStreetLetter() +
                '}';
    }
}
