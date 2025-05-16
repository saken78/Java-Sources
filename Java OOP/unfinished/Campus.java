package Classess;

import java.util.ArrayList;

public class Campus {
    public ArrayList<String> nameSended = new ArrayList<>();

    Campus(ArrayList<String> nama) {
        this.nameSended = nama;
    }

    public void show() {
        System.out.println("Data Statistik");
        for (String n : nameSended) {
            System.out.println("Nama : " + n);
        }

    }
}
