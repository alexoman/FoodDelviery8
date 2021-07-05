package com.company;

import com.company.Anything.Order.*;
import com.company.Anything.Adress;
import com.company.Anything.Payment;
import com.company.Personal.Client;
import com.company.Personal.Driver;
import com.company.Places.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class History {
    public void WriteHistoryCSV(String action) {
        String filepath = "src\\com\\company\\history.csv";
        File file = new File(filepath);

        try {
            FileWriter fileHistory = new FileWriter(file, true);
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy-mm-dd hh-mm-ss");
            LocalDateTime now = LocalDateTime.now();
            String timestamp = now.format(data);
            fileHistory.append(action);
            fileHistory.append(",");
            fileHistory.append(timestamp);
            fileHistory.append("\n");
            fileHistory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
