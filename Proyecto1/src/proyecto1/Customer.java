package Proyecto1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Customer extends Person {

    ArrayList<Customer> customer = new ArrayList<>();
    private int CustAT = 0;
    private String category;
    private String direction;

    public Customer() {
    }

    public Customer(String ID, String name, String lastName, String direction, String category) {
        super(ID, name, lastName);
        this.direction = direction;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    

    //para leer de consola
    Scanner sc = new Scanner(System.in);
    
    public void addCustomer(List<Customer> Customer_A) {
//        int cantClientes = Integer.parseInt(JOptionPane.showInputDialog("Cuantos customer desea agregar?"));
        int custQuantity = 1;
        for (int i = 0; i < custQuantity; i++) {
            
            System.out.println("write the client name");
            setName(sc.nextLine());
            System.out.println("write the client Last name");
            setLastName(sc.nextLine());
            System.out.println("write the client DNI");
            setDNI(sc.nextLine());
            System.out.println("write the client direction");
            setDirection(sc.nextLine());
            int opc;
            String Continue = "Yes";
            while (Continue.equals("Yes")) {
                System.out.println("Write 1 for normal customer and 2 for frecuenly customer");
                opc = Integer.parseInt(sc.nextLine());
                if (opc == 1) {
                    setCategory("Normal client");
                    Continue = "No";
                } else if (opc == 2) {
                    setCategory("Regular client");
                    Continue = "No";
                } else {
                    System.out.println("Invalid option, please select number 1 or number 2");
                }
            }
            Customer_A.add(new Customer(getDNI(), getName(), getLastName(), getDirection(), getCategory()));
            System.out.println("Client added successfully");
            CustAT = CustAT + 1;
        }

    }

    public void deleteCustomer(List<Customer> Customer_A, String ID) {
        for (int i = 0; i < Customer_A.size(); i++) {
            if (Customer_A.get(i).getDNI().equals("1")) {
                Customer_A.remove(i);
            }
        }
    }

    public boolean findCustomer(String id, String name, String lastName, List<Customer> customer) {
        for (int i = 0; i < customer.size(); i++) {
            if (customer.get(i).getDNI().equals(id) && customer.get(i).getName().equals(name) && customer.get(i).getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    public void printCustomer(List<Customer> Customer) {
        System.out.println("CUSTOMER");
        System.out.println("------------------------------------------------------");
        System.out.println("T H E R E  A R E  A  T O T A L  O F  " + CustAT + "  C L I E N T S\n");
        for (int i = 0; i < Customer.size(); i++) {

            System.out.println("CUSTOMER #" + (i + 1) + "");
            System.out.println("NAME: " + Customer.get(i).getName());
            System.out.println("LAST NAME: " + Customer.get(i).getLastName());
            System.out.println("ID: " + Customer.get(i).getDNI());
            System.out.println("CATEGORY: " + Customer.get(i).getCategory());
            System.out.println("DIRECTION: " + Customer.get(i).getDirection());
            System.out.println("------------------------------------------------------");
        }
    }

}
