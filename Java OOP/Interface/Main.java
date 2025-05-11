package interface1;
/* Buat interface BisaMenyerang

    Method: void serang();

Buat class:

    Petarung → menyerang dengan pedang

    Penyihir → menyerang dengan sihir

    Robot → menyerang dengan laser

Di main():

    Buat array BisaMenyerang[] pasukan = new BisaMenyerang[3];

    Isi dengan objek dari ketiga class

    Loop dan panggil serang() → ini adalah polymorphism pakai interface */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ipus = new Scanner(System.in);
        BisaMenyerang[] pasukan = new BisaMenyerang[3];

        for (int i = 0; i < pasukan.length; i++) {
            System.out.print("Jenis : ");
            String jenis = ipus.nextLine();
            System.out.print("Nama : ");
            String nama = ipus.nextLine();

            if (jenis.equalsIgnoreCase("petarung")) {
                pasukan[i] = new Petarung(nama);

            } else if (jenis.equalsIgnoreCase("penyihir")) {
                pasukan[i] = new Penyihir(nama);

            } else if (jenis.equalsIgnoreCase("robot")) {
                pasukan[i] = new Robot(nama);
            }
        }

        for (BisaMenyerang bisaMenyerang : pasukan) {
            bisaMenyerang.serang();

        }
    }
}
