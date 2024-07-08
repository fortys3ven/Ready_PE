/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author fortys3ven.exe
 */
public class ABC {
    public final void setDobByString(String dob){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            try {
                LocalDate dobi = LocalDate.parse(dob, formatter);
                this.dob = dobi;
            } catch (DateTimeParseException e) {
                System.out.println("Must be follow format (dd/MM/yyyy)");
            }
            
    }
}
