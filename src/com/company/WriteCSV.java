package com.company;

import com.company.Anything.Adress;
import com.company.Personal.Client;
import com.company.Personal.Driver;
import com.company.Places.Place;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteCSV {
    public static final String folderPath = "WriteCSV/";

    public void writePlace(Place place, String fileWrite) throws IOException {
        File csvFile = new File(folderPath + fileWrite);

        if (!Files.exists(Paths.get(folderPath))) {
            try {
                Files.createDirectories(Paths.get(folderPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(csvFile));
            String tab = "ID" + "," + "NAME" + "," + "RESTARS" + "," + "CITY" + "," + "STREETNAME" + "STREETLETTER";
            buffer.write(tab + "\n");

            String getters = place.getPlaceId() + "," +
                    place.getName() + "," +
                    place.getReviewstars() + "," +
                    place.getAdress().getCity() + "," +
                    place.getAdress().getStreetName() + "," +
                    place.getAdress().getStreetLetter();
            buffer.write(getters + "\n");
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeClient(Client client, String fileWrite) throws IOException {
        File csvFile = new File(folderPath + fileWrite);

        if (!Files.exists(Paths.get(folderPath))) {
            try {
                Files.createDirectories(Paths.get(folderPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(csvFile));
            String tab = "ID" + "," + "FIRST_NAME" + "," + "LAST_NAME" + "," + "POINTS" + "," + "CITY" + "," + "STREETNAME";
            buffer.write(tab + "\n");

            String getters = client.getId() + "," +
                    client.getFirstName() + "," +
                    client.getLastName() + "," +
                    client.getPoints() + "," +
                    client.getAdress().getCity() + "," +
                    client.getAdress().getStreetName();
            buffer.write(getters + "\n");
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeDriver(Driver driver, String fileWrite) throws IOException {
        File csvFile = new File(folderPath + fileWrite);

        if (!Files.exists(Paths.get(folderPath))) {
            try {
                Files.createDirectories(Paths.get(folderPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(csvFile));
            String tab = "ID" + "," + "FIRST_NAME" + "," + "LAST_NAME" + "," + "STARSRATING";
            buffer.write(tab + "\n");

            String getters = driver.getId() + "," +
                    driver.getFirstName() + "," +
                    driver.getLastName() + "," +
                    driver.getStarsrating();
            buffer.write(getters + "\n");
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeAdress ( Adress adress, String fileWrite) {
        File csvFile = new File(folderPath + fileWrite);

        if (!Files.exists(Paths.get(folderPath))) {
            try {
                Files.createDirectories(Paths.get(folderPath));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter(csvFile));

            String tab = "ID" + "," + "CITY" + "," + "STREETNAME" + "," + "STREETNUMBER" +"," + "STREETLETTER";
            buffer.write(tab + "\n");

            String getters = adress.getAdressId() + "," +
                    adress.getCity() + "," +
                    adress.getStreetName() + "," +
                    adress.getStreetNumber() + "," +
                    adress.getStreetLetter();
            buffer.write(getters + "\n");
            buffer.flush();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
