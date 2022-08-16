
package Proyecto1;


import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Yerry
 */
public class Rent extends Procedure{
    private int daysQuantity; 
    private String state;
    public Rent() {
    }

    public Rent(String date, String brand, String model, double price, String custName, String lastName, String DNI, int daysQuantity,String state){
        super(date, brand, model, price, custName, lastName, DNI);
        this.daysQuantity = daysQuantity;
        this.state = state;
    }

    public int getDaysQuantity() {
        return daysQuantity;
    }

    public void setDaysQuantity(int daysQuantity) {
        this.daysQuantity = daysQuantity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    public void rentPocess(List<Rent> rents, List<Rent> rentActive, String brand, String modelCar, int days, String DNI, String name, String lastName){
        setDate(LocalDate.now()+"");
        setBrand(brand);
        setModel(modelCar);
        setDaysQuantity(days);
        setPrice(days*3000);
        setDNI(DNI);
        setCustName(name);
        setLastName(lastName);
        setState("Pending return");
        rents.add(new Rent(getDate(),getBrand(), getModel(), getPrice(), getCustName(),getLastName(), getDNI(), getDaysQuantity(),getState()));
        printReceip();
    }
    
    public void printReceip(){
        System.out.println("\n\n\n\n\n");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++Rent receipt++++++++++++++++++");
        System.out.println("Date processed: "+ getDate());
        System.out.println("auto processed brand: "+ getBrand());
        System.out.println("car model: "+ getModel());
        System.out.println("Amount to cancel: $"+ getPrice());
        System.out.println("number of days: " + getDaysQuantity());
        System.out.println("customer name: "+ getCustName());
        System.out.println("client last name: "+getLastName());
        System.out.println("client ID:"+getDNI());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("++++++++++++++End of receipt++++++++++++++++++");
        System.out.println("\n\n\n\n\n");
    }
    
    public void reportRent(List<Rent> rents){
        System.out.println("\n\n\n\n\n");
        System.out.println("++++++++++LIST OF RENTALS MADE++++++++++");
        for(int i=0; i<rents.size(); i++){
            System.out.println("************************************************ ******************");
            System.out.println("Rental Date: "+rents.get(i).getDate());
            System.out.println("Rental car brand:"+rents.get(i).getBrand());
            System.out.println("Car model: "+rents.get(i).getModel());
            System.out.println("Rental duration per days: "+rents.get(i).getDaysQuantity());
            System.out.println("Amount to cancel: $"+rents.get(i).getPrice());
            System.out.println("Customer Name: "+rents.get(i).getCustName());
            System.out.println("Customer last name: "+ rents.get(i).getLastName());
            System.out.println("Identification: "+rents.get(i).getDNI());
            System.out.println("Rental Status: "+rents.get(i).getState());
        }
        System.out.println("\n\n\n\n\n");
    }
    
    
    public void profit(List<Rent>rents){
      var ganancias =0;
      for(int i = 0; i<rents.size(); i++){
          ganancias+=rents.get(i).getPrice();
      }
        System.out.println("\n\n\n");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Current car rental earnings is: " +"$"+ganancias);
        System.out.println("\n\n\n");
    }
    
    public String returns(List<Rent>rents,  String id){
        for(int i =0; i<rents.size(); i++){
            if(rents.get(i).getDNI().equals(id)){
                rents.get(i).setState("CANCELLED");
                System.out.println(rents.get(i).getState());
                return rents.get(i).getModel();
            }
        }
        return "";
    }
}
