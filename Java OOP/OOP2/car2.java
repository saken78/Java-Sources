class Car {

    public String merk;
    public int kecepatan;

    Car(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    void jalan() {
        System.out.println(this.merk + " Sedang mengendara");
    }

    void info() {
        System.out.println("Car\t\t: " + this.merk);
        System.out.println("Top Speed\t: " + this.kecepatan);
    }

}

class F1Car extends Car {
    private String driver;

    F1Car(String merk, int kecepatan, String driver) {
        super(merk, kecepatan);
        this.driver = driver;

    }

    @Override
    void jalan() {
        System.out.println("\n" + driver + " dengan " + merk + " very cool ");
        System.out.println("Top Speed : " + kecepatan);
    }

    void pitStop() {
        System.out.println("\n" + driver + " dengan " + merk + " berhenti di pitstop");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Car driver1 = new Car("Ferrari-SF24", 490);
        driver1.jalan();
        driver1.info();

        F1Car driver2 = new F1Car("Mercedes-24F", 670, "Lewis Hamilton");
        driver2.jalan();
        driver2.pitStop();

    }

}
