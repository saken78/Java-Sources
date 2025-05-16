package Classess;

import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    private ArrayList<String> sended = new ArrayList<>();

    Point(ArrayList<String> sender) {
        this.sended = sender;
    }

    public void value() {
        ArrayList<String> done = new ArrayList<>();

        Scanner inputUser = new Scanner(System.in);

        int value = 0;
        int bfr = 0;
        double avrg = 0;
        int inx = 0;

        for (String n : this.sended) {
            avrg = 0;
            bfr = 0;
            inx = 0;
            if (!done.contains(n)) {
                System.out.println("Nama : " + n);
                System.out.println();

                System.out.print("Berapa banyak nilai : ");
                inx = inputUser.nextInt();

                for (int i = 1; i <= inx; i++) {
                    System.out.print("Nilai ke-" + i + " : ");
                    value = inputUser.nextInt();
                    bfr = bfr + value;
                }
                done.add(n);
            } else {
                System.out.println("Nama tidak boleh sama");
            }

            avrg = bfr / inx;
            System.out.println("Nama : " + n + " Average : " + avrg);
        }

    }
}
