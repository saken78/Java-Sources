
class Car {

    private String brand;
    private String model;
    private String mesin;
    private int year;

    Car(String brand, String model, String mesin, int year) {
        this.brand = brand;
        this.model = model;
        this.mesin = mesin;
        this.year = year;
    }

    public void show() {
        System.out.println("Nama\t: " + this.brand);
        System.out.println("Model\t: " + this.model);
        System.out.println("Mesin\t: " + this.mesin);
        System.out.println("Tahun\t: " + this.year);
        System.out.println("\n");
    }

    // setter
    public void setBrand(String brand) {
        this.brand = brand;

    }

    // getter
    public void getAn() {
        // deppends kamu mau ambil apa ;

    }

}

class F1 {
    private String team;
    private String driver;
    private String Car;
    private String model;
    private String mesin;
    private int tahun;

    F1(String team, String driver, String Car, String model, String mesin, int tahun) {
        this.team = team;
        this.driver = driver;
        this.Car = Car;
        this.model = model;
        this.mesin = mesin;
        this.tahun = tahun;
    }

    void display() {
        System.out.println("Team\t: " + this.team);
        System.out.println("Driver\t: " + this.driver);
        System.out.println("Mobil\t: " + this.Car);
        System.out.println("Model\t: " + this.model);
        System.out.println("Mesin\t: " + this.mesin);
        System.out.println("Tahun\t: " + this.tahun);
        System.out.println("\n");
    }
}

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari LaFerrari", "Supercar", "V12 Hybrid", 2013);
        car1.show();
        Car car2 = new Car("Lamborghini Aventador SVJ", "Supercar", "V12", 2019);
        car2.show();
        Car car3 = new Car("McLaren P1", "Supercar", "V8", 2013);
        car3.show();
        Car car4 = new Car("Porsche 918 Spyder", "Supercar", "V8", 2013);
        car4.show();
        Car car5 = new Car("Bugatti Chiron", "Supercar", "W16", 2016);
        car5.show();
        Car car6 = new Car("Koenigsegg Jesko", "Supercar", "V8", 2019);
        car6.show();
        Car car7 = new Car("Pagani Huayra", "Supercar", "V12", 2011);
        car7.show();
        Car car8 = new Car("Aston Martin Valkyrie", "Supercar", "V12", 2021);
        car8.show();
        Car car9 = new Car("Rimac Nevera", "Electric Car", "1914HP", 2021);
        car9.show();
        Car car10 = new Car("Hennessey Venom F5", "Supercar", "V8", 2021);
        car10.show();

        F1 team1 = new F1("Red Bull RB19 ", "Max Verstappen, Sergio Pérez", "Honda RBPT", "F1", "V6 1.6L Hybrid", 2023);
        team1.display();
        F1 team2 = new F1("Mercedes-AMG F1 W13 ", "Lewis Hamilton, George Russell", "Mercedes", "F1", "V6 1.6L Hybrid",
                2022);
        team2.display();
        F1 team3 = new F1("Ferrari SF-75 ", "Charles Leclerc, Carlos Sainz", "Ferrari", "F1", "V6 1.6L Hybrid", 2022);
        team3.display();
        F1 team4 = new F1("McLaren MCL60 ", "Lando Norris, Oscar Piastri", "McLaren", "F1", "V6 1.6L Hybrid", 2023);
        team4.display();
        F1 team5 = new F1("Aston Martin AMR23 ", "Fernando Alonso, Lance Stroll", "Mercedes", "F1", "V6 1.6L Hybrid",
                2023);
        team5.display();

        F1 team2010 = new F1("Mercedes-AMG F1 W11 ", "Lewis Hamilton, Valtteri Bottas", "Mercedes", "F1",
                "V6 1.6L Hybrid", 2020);
        team2010.display();
        F1 team2010_1 = new F1("Red Bull RB7 ", "Sebastian Vettel, Mark Webber", "Renault", "F1", "V6 1.6L Hybrid",
                2011);
        team2010_1.display();
        F1 team2010_2 = new F1("Ferrari SF90 ", "Sebastian Vettel, Charles Leclerc", "Ferrari", "F1", "V6 1.6L Hybrid",
                2019);
        team2010_2.display();

    }
}
