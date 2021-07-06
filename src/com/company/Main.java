package com.company;

import com.company.Anything.Order;
import com.company.Anything.Order.*;
import com.company.Anything.Adress;
import com.company.Anything.Payment;
import com.company.Personal.Client;
import com.company.Personal.Driver;
import com.company.Places.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException{
        String nouString = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss").format(new Date());
        Date dateNou = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss");
        Date date1 = sdf.parse ("2021-07-05 20-06-30");
        Date date2 = sdf.parse ("2021-07-06 16-00-00");

        Delivery delivery = new Delivery();

        Adress adresa1 = new Adress("Emil Racovita", 1, "Vaslui", 'A');
        Adress adresa2 = new Adress("Antoine Griezmann", 3, "Vaslui", 'C');
        Adress adresa3 = new Adress("Decebal", 205, "Vaslui", 'A');
        Adress adresa4 = new Adress("Cameleonilor", 42, "Vaslui", 'B');
        Adress adresa5 = new Adress("Castanilor", 67, "Vaslui", 'C');

        Food mancare1 = new Food("Paste Carbonara", 22, new String[]{"paste, sos, nsht"}, new String[] {"A","B2"});
        Food mancare2 = new Food("Crispy Strips", 24, new String[]{"Piept pui", "Fulgi cereale", "Pesmet", "Oua"}, new String[]{"D3", "K1"});
        Food mancare3 = new Food("Ciorba perisoare", 16, new String[] {"Ciorba", "Carne de pui", "Legume diverse"}, new String[] {"A2", "B3", "C"});
        Food mancare4 = new Food("Pizza Capriciosa", 22, new String[] {"aluat pizza", "ciuperci", "masline", "muschi tiganesc", "mozzarela"}, new String[] {"A"});
        Food mancare5 = new Food("Lava Cake", 31, new String[] {"cafea", "lapte", "cacao", "vulcan"}, new String[] {"C3"});
        Food mancare6 = new Food("Gyros de pui", 16, new String[]{"foietaj", "sosuri nebune", "carne rotisata", "cartofi pai", "salata"}, new String[]{"fara vitamine"});

        List<Food> listaMancaruri1 = new ArrayList<>();
        List<Food> listaMancaruri2 = new ArrayList<>();
        List<Food> listaMancaruri3 = new ArrayList<>();
        listaMancaruri1.add(mancare1);
        listaMancaruri1.add(mancare2);
        listaMancaruri2.add(mancare3);
        listaMancaruri2.add(mancare4);
        listaMancaruri3.add(mancare5);
        listaMancaruri3.add(mancare6);

        Collections.sort(listaMancaruri1);
        Collections.sort(listaMancaruri2);
        Collections.sort(listaMancaruri3);

        Menu menu1 = new Menu(listaMancaruri1);
        Place local1 = new Place("Aroma Copou", 3, menu1, adresa1);
        Menu menu2 = new Menu(listaMancaruri2);
        Place local2 = new Place("Vecchia Roma", 5, menu2, adresa2);
        Menu menu3 = new Menu(listaMancaruri3);
        Place local3 = new Place("Bosfor", 2, menu3, adresa3);

        Client client1 = new Client("Alex", "Roman", 21, 50, adresa4 );
        Client client2 = new Client("Rares", "Roman", 14, 15, adresa5 );
        Driver driver1 = new Driver("Vlad", "Dudau", 21, 3);
        Driver driver2 = new Driver("Marian", "Cazacu", 23, 5);

        Payment card1 = new Payment("1222 3333 4572 8188", dateNou, "182", "Alex Roman");
        Payment card2 = new Payment("7658 4672 1800 2483", dateNou, "993", "Rares Roman");

        System.out.println("Meniul acestui local " + local1.getName());
        delivery.printPlaceMenu(local1);

        Order order1 = new Order(local1, client1, driver1, date1, card1);
        delivery.AddFood(order1, mancare2, 4);
        System.out.println("Produsul " + mancare2.getName() + " a fost adaugat la comanda");
        delivery.AddFood(order1, mancare1, 1);
        System.out.println("Produsul " + mancare1.getName() + " a fost adaugat la comanda");

        System.out.println("Produsele adaugate la comanda " + order1.getOrderId() + " sunt : ");
        for(String food:delivery.getFoodNameFromOrder(order1)) {
            System.out.println("  " + food);
        }

        System.out.println(" Pretul total al acestei comenzi este : " + delivery.getTotalPrice(order1));
        System.out.println(" Pretul impreuna cu reducerea folosita pe baza punctelor este : " + delivery.doDiscount(order1) + "\n\n\nBUN VENIT\n");



        Order order2 = new Order(local3, client2, driver2, date2, card2);
        delivery.AddFood(order2, mancare5, 1);
        System.out.println("Produsul " + mancare5.getName() + " a fost adaugat la comanda");
        delivery.AddFood(order2, mancare6, 3);
        System.out.println("Produsul " + mancare6.getName() + " a fost adaugat la comanda");

        System.out.println("Produsele adaugate la comanda " + order2.getOrderId() + " sunt : ");
        for(String food:delivery.getFoodNameFromOrder(order2)) {
            System.out.println("  " + food);
        }

        System.out.println(" Pretul total al acestei comenzi este : " + delivery.getTotalPrice(order2));
        System.out.println(" Pretul impreuna cu reducerea folosita pe baza punctelor este : " + delivery.doDiscount(order2));

        // lista cu toate localurile dintr-un anumit oras --- in cazul meu, am pus doar orasul Vaslui
        List<Place> places = new ArrayList<>();
        places.add(local1);
        places.add(local2);
        places.add(local3);
        // Putem cauta localuri in functie de oras cu aceasta functie :
        delivery.getAllPlacesFromCity("Vaslui", places);
        // Putem cauta localurile cu un anumit fel de mancare precum :
        delivery.getAllPlacesWithSameFood("Gyros de pui", places);

        // Putem cauta comenzile unui client astfel :
        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        delivery.getAllClientsOrders(client2, orders);

        // Putem cauta comenzi in functie de ziua in care au fost plasate
        delivery.GetOrderOfTheDay("2021-07-05", orders);

        // Putem cauta comenzile primite de un anumit restaurant
        delivery.getOrdersFromSpecificPlace(local3, orders);



        ReadCSV.CSVDriver();
        ReadCSV.CSVClient();
        ReadCSV.CSVFood();
        ReadCSV.CSVPlace();



    }
}
