package com.company.Anything;

import com.company.Places.*;
import com.company.Personal.Client;
import com.company.Personal.Driver;
import com.company.Anything.Payment;

import java.util.ArrayList;
import java.util.*;

public class Order {
    public static int ct = 0;
    private int orderId;
    private Place place;
    private Client client;
    private Driver driver;
    private List<Map<Food,Integer>> foods = new ArrayList<>();
    private Date orderDate;
    private Payment payment;

    public Order( Place place, Client client, Driver driver, Date orderDate, Payment payment) {
        this.place = place;
        this.client = client;
        this.driver = driver;
        this.orderDate = orderDate;
        this.payment = payment;
    }

    {
        ct++;
        this.orderId = ct;
    }

    public int getOrderId() {
        return orderId;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Map<Food, Integer>> getFoods() {
        return foods;
    }

    public void setFoods(List<Map<Food, Integer>> foods) {
        this.foods = foods;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Order.order{" +
                "orderId=" + orderId +
                ", place=" + place.getName() +
                ", client=" + client.getLastName() + client.getFirstName() +
                ", driver=" + driver.getLastName() + driver.getFirstName() +
                ", orderDate='" + orderDate + '\'' +
                ", payment=" + payment.getCardNumber() + payment.getCardUser() +
                '}';
    }
}
