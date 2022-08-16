package proyecto1;

import Proyecto1.Rent;
import Proyecto1.Customer;
import Proyecto1.Sales;
import Proyecto1.SellingAgent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {

    public static void main(String[] args) {

        int opc = 1;
        List<Customer> customer = new ArrayList();
        Customer C = new Customer();
        Car car = new Car();
        SellingAgent agent = new SellingAgent();
        Rent CarRent = new Rent();
        Sales sale = new Sales();
        

        List<Car> Toyota = new ArrayList();
        List<Car> Nissan = new ArrayList();
        List<Car> Lexus = new ArrayList();
        List<Car> Honda = new ArrayList();
        
        List<SellingAgent> agents = new ArrayList();
        
        
        List<Sales>ventas = new ArrayList();
        agent.agregarAgentes("asd", "asd");
        //historial de alquileres
        List<Rent> alquileres = new ArrayList();
        //alquileres que no han devuelto
        List<Rent> AlquileresActivos = new ArrayList();
        //para leer de consola
        Scanner sc = new Scanner(System.in);
        // se llena el array de carros
        car.addCar(Toyota, Lexus, Nissan, Honda);

        //add aagentes
        agent.insertAgent(agents);
        while (opc != 0) {
            System.out.println("What do you want to do?\n1.Add clients\n2.Show Clients\n3.Consult cars\n4.Process rental\n5.Rental report\n6.Rental profit\n7.Make refund\n8.Make vehicle purchase\n9 Look Agends\n0 .Leave");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc) {
                case 1:
                    C.addCustomer(customer);
                    C.printCustomer(customer); 
                            
                    break;
                case 2:
                    C.printCustomer(customer);
                    break;
                case 3:
                    //consulta 
                    System.out.println("---Car Consultation---");
                    System.out.println("Enter brand of your choice (Toyota, Nissan, Lexus, Honda)");
                    var carOption = sc.nextLine();
                    car.printCar(Toyota, Nissan, Lexus, Honda, carOption);
                    break;
                case 4:
                    //Alquileres
                    System.out.println("--Rental procedures--");
                    System.out.println("Indicate the car brand you want to consult (Toyota,Nissan,Lexus,Honda)");
                    var Brand = sc.nextLine();
                    if (Brand != null) {
                        car.printCar(Toyota, Nissan, Lexus, Honda, Brand);
                        System.out.println("What car model do you want to rent?");
                        String carModel = sc.nextLine().toUpperCase();

                        boolean exste = false;
                        carModel = carModel.toUpperCase();

                        if (Brand.toUpperCase().equals("TOYOTA")) {
                            car.findModelToyota(carModel.toUpperCase(), Toyota);
                        }
                        if (Brand.toUpperCase().equals("NISSAN")) {
                            car.findModelNissan(carModel.toUpperCase(), Lexus);

                        }
                        if (Brand.toUpperCase().equals("LEXUS")) {
                            car.findModelLexus(carModel.toUpperCase(), Nissan);
                        }
                        if (Brand.toUpperCase().equals("HONDA")) {
                            car.findModelHonda(carModel.toUpperCase(), Honda);

                        }
                        System.out.println("Enter the client ID");
                        String DNI = sc.nextLine();
                        System.out.println("Enter the client name");
                        String Name = sc.nextLine();
                        System.out.println("Enter the client last name");
                        String lastName = sc.nextLine();
                        var existCustomer = C.findCustomer(DNI, Name, lastName, customer);
                        if (existCustomer) {
                            System.out.println("How many days do you want to rent the vehicle?");
                            int days = Integer.parseInt(sc.nextLine());
                            if (days < 2) {
                                System.out.println("The minimum number of days is 2");
                            }
                            while (days < 2) {
                                System.out.println("Please enter a number of days greater than or equal to 2");
                                days = Integer.parseInt(sc.nextLine());
                            }

                            CarRent.rentPocess(alquileres, AlquileresActivos, Brand, carModel, days, DNI, Name, lastName);
                        } else {
                            System.out.println("The consulted user is not part of our clients");
                        }
                    }

                    break;
                case 5:
                    System.out.println("Generate report of all rentals");
                    CarRent.reportRent(alquileres);
                    break;

                case 6:
                    System.out.println("rental income");
                    CarRent.profit(alquileres);
                    break;
                case 7:
                    System.out.println("Make a refund");
                    System.out.println("Enter your ID to make your return");
                    var Identification = sc.nextLine();
                    String Modelocancelado = CarRent.returns(alquileres, Identification);
                    car.refillStock(Toyota, Nissan, Lexus, Honda, Modelocancelado);
                    break;
                case 8:
                    System.out.println("Make a purchase");
                    System.out.println("Enter your information");
                    System.out.println("\n");
                    System.out.println("Write your ID");
                    var identificacionComprador = sc.nextLine();
                    System.out.println("Write your name");
                    var nombreComprador = sc.nextLine();
                    System.out.println("Write your LastName");
                    var ApellidoComprador = sc.nextLine();
                    
                
                    System.out.println("Brand");
                    var brand = sc.nextLine().toUpperCase();
                    System.out.println("Model");
                    var model = sc.nextLine().toUpperCase();
                    System.out.println("1 new, 2 used");
                    var CarCondition = Integer.parseInt(sc.nextLine());
                    var ExistCar = car.carsByType(brand, model, CarCondition, Toyota, Nissan, Lexus, Honda);
                    var existCustomer = C.findCustomer(identificacionComprador, nombreComprador, ApellidoComprador, customer);
                    if(ExistCar==true && existCustomer==true){
                        sale.salesPocess(ventas, brand, model, "For-Ever", identificacionComprador, nombreComprador, ApellidoComprador);
                    }
                    break;
                case 9:
                    agent.lookAgends(agents);
                    break;
                default:
                    break;
            }

        }

    }
}
