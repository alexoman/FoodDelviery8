package com.company.Personal;

import com.company.Anything.Adress;

public class Client extends Person {
    private double points;
    Adress adress;

    public Client (String lastName, String firstName, int age, double points, Adress adress) {
        super(lastName,firstName,age);
        this.points = points;
        this.adress = adress;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
