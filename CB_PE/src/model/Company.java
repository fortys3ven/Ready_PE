/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fortys3ven.exe
 */
public class Company {
    
   public void loadData(String fName) {
        String cus;
        try (BufferedReader br = new BufferedReader(new FileReader(fName))) {
            while ((cus = br.readLine()) != null) {
                String[] b = cus.split(":");
                if (b.length == 4) {
                    try {
                        staff.add(new Staff( b[0], b[1], b[2], b[3]));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        } catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Error reading file", ex);
        }
    }
}
