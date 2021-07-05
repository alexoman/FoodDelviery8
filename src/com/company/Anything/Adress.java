package com.company.Anything;

public class Adress {
    private static int ct = 0;
    private int adressId;
    private String streetName;
    private int streetNumber;
    private String city;
    private char streetLetter;

    public Adress(String streetName, int streetNumber, String city, char streetLetter) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.streetLetter = streetLetter;
    }

    {
        ct ++;
        this.adressId = ct;
    }

    public int getAdressId() {
        return adressId;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public char getStreetLetter() {
        return streetLetter;
    }

    public void setStreetLetter(char streetLetter) {
        this.streetLetter = streetLetter;
    }

}
