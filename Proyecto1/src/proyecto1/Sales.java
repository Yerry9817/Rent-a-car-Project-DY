/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto1;

import java.util.List;

/**
 *
 * @author Yerry
 */
public class Sales extends Procedure{
    public String useTime;
    private String SalesAgentDNI;
    private double comision;
    public Sales(String fecha, String marca, String modelo,String useTime, double monto, String nombreCliente, String apellido, String DNI, String SalesAgenDNI, double comision){
        super(fecha, marca, modelo, monto, nombreCliente, apellido, DNI);
        this.useTime = useTime;
        this.SalesAgentDNI = SalesAgenDNI;
        this.comision = comision;
    }   

    public Sales() {
    }

    public String getUseTime() {
        return useTime;
    }

    public void setUseTime(String useTime) {
        this.useTime = useTime;
    }

    public String getSalesAgentDNI() {
        return SalesAgentDNI;
    }

    public void setSalesAgentDNI(String SalesAgentDNI) {
        this.SalesAgentDNI = SalesAgentDNI;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    
    
    public void salesPocess(List<Sales> ventas, String Marca, String modeloAuto, String tiempoUso, String cedula, String nombre, String apellido){
        setDate("22/07/2022");
        setBrand(Marca);
        setModel(modeloAuto);
        setUseTime("Forever");
        setPrice((double)Math.random()*50000);
        setComision(getPrice()*0.05);
        setDNI(cedula);
        setCustName(nombre);
        setLastName(apellido);
        ventas.add(new Sales(getDate(),getBrand(), getModel(), getUseTime(), getPrice(), getCustName(),getLastName(), getDNI(), getSalesAgentDNI(), getComision()));
        printReceip();
    }
    
    
     public void printReceip(){
        System.out.println("\n\n\n\n\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++SALE VOUTCHER++++++++++++++++++");
        System.out.println("Date processed: "+ getDate());
        System.out.println("auto processed brand: "+ getBrand());
        System.out.println("car model: "+ getModel());
        System.out.println("Amount to cancel: $"+ getPrice());
        System.out.println("number of days: " + getUseTime());
        System.out.println("customer name: "+ getCustName());
        System.out.println("client last name: "+getLastName());
        System.out.println("client ID:"+getDNI());
        System.out.println("Sales Agend ID:"+getSalesAgentDNI());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++Fin De Recibo++++++++++++++++++");
        System.out.println("\n\n\n\n\n");
    }
}

