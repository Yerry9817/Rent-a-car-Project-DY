package proyecto1;

import Proyecto1.Notify;
import java.util.ArrayList;
import java.util.List;

public class Car implements Notify {

    private String state;
    private String plate;
    private String brand;
    private String model;
    private String chasis;
    private String VIN;
    private String color;
    private int year;
    private int price;
    private String onStock;

    public Car() {
    }

    public Car(String state, String plate, String brand, String model, String chasis, String VIN, String color, int year, int price, String onStock) {
        this.state = state;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.chasis = chasis;
        this.VIN = VIN;
        this.color = color;
        this.year = year;
        this.price = price;
        this.onStock = onStock;

    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

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

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOnStock() {
        return onStock;
    }

    public void setOnStock(String onStock) {
        this.onStock = onStock;
    }

    public void randomColor() {
        final String colores[] = {"Red", "Green", "Turquoise", "Yellow", "Blue"};
        for (int i = 0; i < 5; i++) {
            int index = (int) (Math.random() * 5);
            setColor(colores[index]);
        }

    }

    public void randomPlate(int possiblePlate) {
        possiblePlate = 10000;
        ArrayList<Integer> plate = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * possiblePlate);
            plate.add(random);
            setPlate(String.valueOf(random));
        }
    }

    public void randomPrice(int PriceMin, int PriceMax) {
        PriceMin = 20000;
        PriceMax = 59000;
        ArrayList<Integer> Price = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * (PriceMax - PriceMin + 1) + PriceMin);
            Price.add(random);
            setPrice(random);
        }

    }

    public void randomVIN() {
        ArrayList<Integer> VIN = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int Aleatorio = (int) (Math.random() * 10000);
            VIN.add(Aleatorio);
            setVIN(String.valueOf(Aleatorio));
        }
    }

    public void randomChasis() {
        ArrayList<Integer> Chasis = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10000);
            Chasis.add(random);
            setChasis(String.valueOf(random));
        }
    }

    public void randomAnho(int yearMin, int yearMax) {
        yearMin = 2000;
        yearMax = 2022;
        ArrayList<Integer> year = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * (yearMax - yearMin + 1) + yearMin);
            year.add(random);
            setYear((random));
        }
    }

    public void randomCarState() {
        ArrayList<String> CarState = new ArrayList<>();
        CarState.add("New");
        CarState.add("Used");
        for (int i = 0; i < CarState.size(); i++) {
            int index = (int) (Math.random() * 2);
            setState(CarState.get(index));
        }
    }

    public void randomToyotaModel() {
        ArrayList<String> ToyotaModel = new ArrayList<>();
        ToyotaModel.add("AURIS");
        ToyotaModel.add("GT86");
        ToyotaModel.add("PRIUS");
        ToyotaModel.add("RAV4");
        ToyotaModel.add("SUPRA");
        ToyotaModel.add("YARIS");

        for (int i = 0; i < ToyotaModel.size(); i++) {
            int index = (int) (Math.random() * 6);
            setModel(ToyotaModel.get(index));
        }
    }

    public void randomModelNissan() {
        ArrayList<String> NissanModel = new ArrayList<>();
        NissanModel.add("NV400");
        NissanModel.add("PATHFINDER");
        NissanModel.add("X-TRAIL");
        NissanModel.add("PULSAR");
        NissanModel.add("QASHIQAI");
        NissanModel.add("GT-R");

        for (int i = 0; i < NissanModel.size(); i++) {
            int index = (int) (Math.random() * 6);
            setModel(NissanModel.get(index));
        }
    }

    public void randomModelLexus() {
        ArrayList<String> LexusModel = new ArrayList<>();
        LexusModel.add("IS");
        LexusModel.add("RC");
        LexusModel.add("RX");
        LexusModel.add("LC");
        LexusModel.add("UX");
        LexusModel.add("CT");

        for (int i = 0; i < LexusModel.size(); i++) {
            int index = (int) (Math.random() * 6);
            setModel(LexusModel.get(index));
        }
    }

    public void randomModelHonda() {
        ArrayList<String> HondaModel = new ArrayList<>();
        HondaModel.add("CIVIC");
        HondaModel.add("CR -V");
        HondaModel.add("ZR-V");
        HondaModel.add("JAZZ");
        HondaModel.add("HR-V");
        HondaModel.add("ACCORD");

        for (int i = 0; i < HondaModel.size(); i++) {
            int index = (int) (Math.random() * 6);
            setModel(HondaModel.get(index));
        }

    }

    public void Toyota(List<Car> ToyotaCar) {

        for (int i = 0; i < 10; i++) {
            randomColor();
            randomPlate(10000);
            randomVIN();
            randomChasis();
            randomAnho(2000, 2022);
            setBrand("TOYOTA");
            randomToyotaModel();
            randomCarState();
            randomPrice(20000, 59000);
            setOnStock("Avaliable");
            ToyotaCar.add((Car) new Car(getState(), getPlate(), getBrand(), getModel(), getChasis(), getVIN(), getColor(), getYear(), getPrice(), getOnStock()));
            setVIN("");
            setPrice(0);
            setPlate("");
            setOnStock("");
            setModel("");
            setBrand("");
            setState("");
            setColor("");
            setChasis("");
            setYear(0);

        }

    }

    public void Nissan(List<Car> NissanCar) {
        for (int i = 0; i < 10; i++) {
            randomColor();
            randomPlate(10000);
            randomVIN();
            randomChasis();
            randomAnho(2000, 2022);
            setBrand("NISSAN");
            randomModelNissan();
            randomCarState();
            randomPrice(20000, 59000);
            setOnStock("Avaliable");
            NissanCar.add((Car) new Car(getState(), getPlate(), getBrand(), getModel(), getChasis(), getVIN(), getColor(), getYear(), getPrice(), getOnStock()));
            setVIN("");
            setPrice(0);
            setPlate("");
            setOnStock("");
            setModel("");
            setBrand("");
            setState("");
            setColor("");
            setChasis("");
            setYear(0);
        }

    }

    public void Lexus(List<Car> LexusCar) {
        for (int i = 0; i < 10; i++) {
            randomColor();
            randomPlate(10000);
            randomVIN();
            randomChasis();
            randomAnho(2000, 2022);
            setBrand("LEXUS");
            randomModelLexus();
            randomCarState();
            randomPrice(20000, 59000);
            setOnStock("Avaliable");
            LexusCar.add((Car) new Car(getState(), getPlate(), getBrand(), getModel(), getChasis(), getVIN(), getColor(), getYear(), getPrice(), getOnStock()));
            setVIN("");
            setPrice(0);
            setPlate("");
            setOnStock("");
            setModel("");
            setBrand("");
            setState("");
            setColor("");
            setChasis("");
            setYear(0);
        }

    }

    public void Honda(List<Car> HondaCar) {
        for (int i = 0; i < 10; i++) {
            randomColor();
            randomPlate(10000);
            randomVIN();
            randomChasis();
            randomAnho(2000, 2022);
            setBrand("HONDA");
            randomModelHonda();
            randomCarState();
            randomPrice(20000, 59000);
            setOnStock("Avaliable");
            HondaCar.add((Car) new Car(getState(), getPlate(), getBrand(), getModel(), getChasis(), getVIN(), getColor(), getYear(), getPrice(), getOnStock()));
            setVIN("");
            setPrice(0);
            setPlate("");
            setOnStock("");
            setModel("");
            setBrand("");
            setState("");
            setColor("");
            setChasis("");
            setYear(0);
        }

    }

    public void addCar(List<Car> ToyotaCar, List<Car> NissanCar, List<Car> LexusCar, List<Car> HondaCar) {
        Toyota(ToyotaCar);
        Nissan(NissanCar);
        Lexus(LexusCar);
        Honda(HondaCar);
    }

    public void printCar(List<Car> ToyotaCar, List<Car> LexusCar, List<Car> NissanCar, List<Car> HondaCar, String carOption) {
        Notify();
        if (carOption.toLowerCase().equals("toyota")) {
            System.out.println("-----TOYOTA CARS-----");
            for (int i = 0; i < ToyotaCar.size(); i++) {
                System.out.println("Brand: " + ToyotaCar.get(i).getBrand() + "\nModel: " + ToyotaCar.get(i).getModel() + "\nChasis: " + ToyotaCar.get(i).getChasis() + "\nState: " + ToyotaCar.get(i).getState() + "\nColor: " + ToyotaCar.get(i).getColor() + "\nPlate: " + ToyotaCar.get(i).getPlate() + "\nVIN " + ToyotaCar.get(i).getVIN() + "\nStock? " + ToyotaCar.get(i).getOnStock() + "\n");
            }
        }
        if (carOption.toLowerCase().equals("nissan")) {
            System.out.println("----NISSAN CARS-----");
            for (int i = 0; i < NissanCar.size(); i++) {
                System.out.println("Brand: " + NissanCar.get(i).getBrand() + "\nModel: " + NissanCar.get(i).getModel() + "\nChasis: " + NissanCar.get(i).getChasis() + "\nState: " + NissanCar.get(i).getState() + "\nColor: " + NissanCar.get(i).getColor() + "\nPlate: " + NissanCar.get(i).getPlate() + "\nVIN " + NissanCar.get(i).getVIN() + "\nStock? " + NissanCar.get(i).getOnStock() + "\n");
            }
        }
        if (carOption.toLowerCase().equals("lexus")) {
            System.out.println("-----LEXUS CARS-----");
            for (int i = 0; i < LexusCar.size(); i++) {
                System.out.println("Brand: " + LexusCar.get(i).getBrand() + "\nModel: " + LexusCar.get(i).getModel() + "\nChasis: " + LexusCar.get(i).getChasis() + "\nState: " + LexusCar.get(i).getState() + "\nColor: " + LexusCar.get(i).getColor() + "\nPlate: " + LexusCar.get(i).getPlate() + "\nVIN " + LexusCar.get(i).getVIN() + "\nStock? " + LexusCar.get(i).getOnStock() + "\n");
            }
        }
        if (carOption.toLowerCase().equals("honda")) {
            System.out.println("-----HONDA CARS-----");
            for (int i = 0; i < HondaCar.size(); i++) {
                System.out.println("Brand: " + HondaCar.get(i).getBrand() + "\nModel: " + HondaCar.get(i).getModel() + "\nChasis: " + HondaCar.get(i).getChasis() + "\nState: " + HondaCar.get(i).getState() + "\nColor: " + HondaCar.get(i).getColor() + "\nPlate: " + HondaCar.get(i).getPlate() + "\nVIN " + HondaCar.get(i).getVIN() + "\nStock? " + HondaCar.get(i).getOnStock() + "\n");
            }
        }
    }

    Boolean findModelToyota(String carModel, List<Car> ToyotaCar) {
        boolean isAvailable = false;
        if (carModel != null) {
            for (int i = 0; i < ToyotaCar.size(); i++) {
                System.out.println("Model Toyota cars:" + ToyotaCar.get(i).getModel());
                System.out.println("console model" + carModel);
                if (ToyotaCar.get(i).getModel().equals(carModel.toUpperCase())) {
                    System.out.println(ToyotaCar.get(i).getModel());
                    isAvailable = true;
                    ToyotaCar.get(i).setOnStock("RENTED");
                    break;
                }
            }
        }
        return isAvailable;
    }

    Boolean findModelNissan(String carModel, List<Car> NissanCar) {
        boolean isAvailable = false;
        if (carModel != null) {
            for (int i = 0; i < NissanCar.size(); i++) {
                System.out.println("Nissancars model:" + NissanCar.get(i).getModel());
                System.out.println("console model" + carModel);
                if (NissanCar.get(i).getModel().equals(carModel.toUpperCase())) {
                    System.out.println(NissanCar.get(i).getModel());
                    isAvailable = true;
                    NissanCar.get(i).setOnStock("RENTED");
                    break;
                }
            }
        }
        return isAvailable;
    }

    Boolean findModelLexus(String carModel, List<Car> LexusCar) {
        boolean isAvailable = false;
        if (carModel != null) {
            for (int i = 0; i < LexusCar.size(); i++) {
                System.out.println("carsLexus model:" + LexusCar.get(i).getModel());
                System.out.println("console model" + carModel);
                if (LexusCar.get(i).getModel().equals(carModel.toUpperCase())) {
                    System.out.println(LexusCar.get(i).getModel());
                    isAvailable = true;
                    LexusCar.get(i).setOnStock("RENTED");
                    break;
                }
            }
        }
        return isAvailable;
    }

    Boolean findModelHonda(String carModel, List<Car> HondaCar) {
        boolean isAvailable = false;
        if (carModel != null) {
            for (int i = 0; i < HondaCar.size(); i++) {
                System.out.println("carsHonda model:" + HondaCar.get(i).getModel());
                System.out.println("console model" + carModel);
                if (HondaCar.get(i).getModel().equals(carModel.toUpperCase())) {
                    System.out.println(HondaCar.get(i).getModel());
                    isAvailable = true;
                    HondaCar.get(i).setOnStock("Rented");
                    break;
                }
            }
        }
        return isAvailable;
    }

    public void refillStock(List<Car> toyotaCar, List<Car> NissanCar, List<Car> LexusCar, List<Car> HondaCar, String CancellendModel) {
        var found = false;

        if (CancellendModel != null) {
            for (int i = 0; i < toyotaCar.size(); i++) {
                if (toyotaCar.get(i).getModel().equals(CancellendModel)) {
                    toyotaCar.get(i).setOnStock("AVAILABLE");
                    return;
                }

            }

            for (int i = 0; i < NissanCar.size(); i++) {
                if (NissanCar.get(i).getModel().equals(CancellendModel)) {

                    NissanCar.get(i).setOnStock("AVAILABLE");
                    return;
                }
            }

            for (int i = 0; i < LexusCar.size(); i++) {
                if (LexusCar.get(i).getModel().equals(CancellendModel)) {

                    LexusCar.get(i).setOnStock("AVAILABLE");
                    return;
                }
            }

            for (int i = 0; i < HondaCar.size(); i++) {
                if (HondaCar.get(i).getModel().equals(CancellendModel)) {

                    HondaCar.get(i).setOnStock("AVAILABLE");
                    return;
                }
            }

        }

    }

    public boolean carsByType(String Brand, String model, int carType, List<Car> Toyota, List<Car> Nissan, List<Car> Lexus, List<Car> Honda) {
        String CarPreference;
        if (carType == 1) {
            CarPreference = "Nuevo";
        } else {
            CarPreference = "Usado";
        }
        for (int i = 0; i < Toyota.size(); i++) {
            if (Toyota.get(i).getBrand().equals(Brand) && Toyota.get(i).getModel().equals(model) && Toyota.get(i).getState().equals(CarPreference) && Toyota.get(i).getOnStock().equals("Disponible")) {
                Toyota.get(i).setOnStock("SOLD OUT");
                return true;
            }
        }
        for (int i = 0; i < Nissan.size(); i++) {
            if (Nissan.get(i).getBrand().equals(Brand) && Nissan.get(i).getModel().equals(model) && Nissan.get(i).getState().equals(carType)) {
                Nissan.get(i).setOnStock("SOLD OUT");
                return true;
            }
        }
        for (int i = 0; i < Lexus.size(); i++) {
            if (Lexus.get(i).getBrand().equals(Brand) && Lexus.get(i).getModel().equals(model) && Lexus.get(i).getState().equals(carType)) {
                Lexus.get(i).setOnStock("SOLD OUT");
                return true;
            }
        }
        for (int i = 0; i < Honda.size(); i++) {
            if (Honda.get(i).getBrand().equals(Brand) && Honda.get(i).getModel().equals(model) && Honda.get(i).getState().equals(carType)) {
                Honda.get(i).setOnStock("SOLD OUT");
                return true;
            }
        }
        return true;
    }

    @Override
    public void Notify() {
        System.out.println("Cars are being printed, please wait");
    }

}
