package com.company;

import com.company.Personal.Client;
import com.company.Places.*;
import com.company.Anything.*;
import com.company.Personal.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadCSV {
    public static void CSVDriver() {
        String file = "src\\com\\company\\Personal\\driver.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            }  catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void CSVClient() {
        String file = "src\\com\\company\\Personal\\client.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void CSVFood() {
        String file = "src\\com\\company\\Places\\food.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public  static void CSVPlace() {
        String file = "src\\com\\company\\Places\\place.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-10s", index);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
