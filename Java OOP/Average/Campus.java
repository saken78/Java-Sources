package Classess;

import java.util.ArrayList;

public class Campus {
    public ArrayList<String> nameSended = new ArrayList<>();
    public ArrayList<Double> sender = new ArrayList<>();

    Campus(ArrayList<String> nama, ArrayList<Double> sended) {
        this.nameSended = nama;
        this.sender = sended;
    }

    public void show() {
        System.out.println("Data Statistik");
        for (String n : nameSended) {
            for (Double m : sender) {
                System.out.println("Nama : " + n);
                System.out.println("Average : " + m);
            }
        }

    }
}
