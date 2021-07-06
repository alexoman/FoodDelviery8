package com.company;

import com.company.Personal.Client;
import com.company.Places.*;
import com.company.Anything.*;
import com.company.History;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Delivery {
    private Food getFoodFromMenu(String foodName, Menu menu) {
        List<Food> foods = menu.getFoods();
        History history = new History();
        history.WriteHistoryCSV("ShowFoodFromMenu");
        for( Food food : foods) {
            if(food.getName() == foodName) {
                return food;
            }
        }
        return null;
    }

    public void AddFood(Order order, Food food, int howmany) {
        List<Map<Food, Integer>> foods = order.getFoods();
        Map<Food, Integer> myOrder = new HashMap<>();
        History history = new History();
        history.WriteHistoryCSV("AddedFood");

        if(getFoodFromMenu(food.getName(), order.getPlace().getMenu()) != null) {
            myOrder.put(food, howmany);
            foods.add(myOrder);
        } else {
            System.out.println("The food you want" + food.getName() + "is not in our menu right now");
        }
    }

    public int getTotalPrice(Order order) {
        List<Map<Food, Integer>> foods = order.getFoods();
        History history = new History();
        history.WriteHistoryCSV("ShowTotalPrice");
        int total = 0;
        for (Map<Food, Integer> food : foods) {
            for (Map.Entry<Food, Integer> entry : food.entrySet()) {
                total += entry.getKey().getPrice() * entry.getValue();
            }
        }
        return total;
    }

    public List<String> getFoodNameFromOrder(Order order) {
        List<Map<Food, Integer>> foods = order.getFoods();
        List<String> names = new ArrayList<>();
        History history = new History();
        history.WriteHistoryCSV("ShowFoodNameFromOrder");
        for (Map<Food, Integer> food : foods) {
            for (Map.Entry<Food, Integer> entry : food.entrySet()) {
                names.add(entry.getKey().getName());
            }
        }
        return names;
    }

    public void printPlaceMenu(Place place) {
        List<Food> foods = place.getMenu().getFoods();
        History history = new History();
        history.WriteHistoryCSV("ShowTheMenuOfThePlace");
        for(Food food : foods) {
            System.out.println(food.getName() + " - " + food.getPrice() + " euro" + "\n    " + "ingredients: " + Arrays.toString(food.getIngredients()) + " vitamins: " + Arrays.toString(food.getVitamins()));
        }
    }
    // we drop the price like this : if the client has 17 points then we drop the price by 17% from the toal price
    public double doDiscount(Order order) {
        double total = getTotalPrice(order);
        double reduction = (order.getClient().getPoints() / 100) * total;
        return total - reduction;
    }

    public void getAllPlacesFromCity(String city, List<Place> places) {
        History history = new History();
        history.WriteHistoryCSV("ShowAllPlacesFromCity");
        for (Place place : places) {
            if (place.getAdress().getCity().equals(city)) {
                System.out.println(place.toString());
            }
        }
    }

    public void getAllPlacesWithSameFood(String fooodName, List<Place> places) {
        History history = new History();
        history.WriteHistoryCSV("ShowPlacesWithSameFood");
        for (Place place : places) {
            for (Food food : place.getMenu().getFoods()) {
                if (food.getName().equals(fooodName)) {
                    System.out.println(place.toString());
                }
            }
        }
    }

    public void getAllClientsOrders(Client client, List<Order> orders) {
        History history = new History();
        history.WriteHistoryCSV("ShowOrdersFromClients");
        for(Order order : orders) {
            if (order.getClient().equals(client)) {
                System.out.println(order.toString());
            }
        }
    }

    public void GetOrderOfTheDay(String day, List<Order> orders) {
        History history = new History();
        history.WriteHistoryCSV("ShowADaySOrder");
        for (Order order : orders) {
            String date = new SimpleDateFormat("yyyy-mm-dd").format(order.getOrderDate());
            if(date.equals(day)) {
                System.out.println(order.toString());
            }
        }
    }

    public void getOrdersFromSpecificPlace(Place place, List<Order> orders) {
        History history = new History();
        history.WriteHistoryCSV("ShowOrderFromAPlace");
        for (Order order : orders) {
            if (order.getPlace().equals(place)) {
                System.out.println(order.toString());
            }
        }
    }
}
