/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

/**
 *
 * @author Yerry
 */
public abstract class Procedure {

    private String date;
    private String brand;
    private String model;
    private double price;
    private String plate;
    private String custName;
    private String lastName;
    private String DNI;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Procedure(String date, String brand, String model, double price, String custName, String lastName, String DNI) {
        this.date = date;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.custName = custName;
        this.lastName = lastName;
        this.DNI = DNI;
    }

    public Procedure() {
    }

}
