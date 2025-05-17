package Classess;

/* Input data beberapa mahasiswa (nama, NIM, nilai)

Simpan ke dalam ArrayList<Mahasiswa>

Kirim ke class Kampus untuk:

    Menampilkan semua data

    Menampilkan mahasiswa yang lulus (nilai >= 75)

    Hitung nilai rata-rata */

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Double> average = new ArrayList<>();

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan ada berapa mahasiswa : ");
        int bffr = inputUser.nextInt();
        inputUser.nextLine(); // buang newline dari nextInt()
        String put;

        for (int i = 1; i <= bffr; i++) {
            System.out.print("Nama ke-" + i + " : ");
            put = inputUser.nextLine();
            nama.add(put);
        }

        Point other1 = new Point(nama);
        other1.value();

        average = other1.value();

        Campus other = new Campus(nama, average);
        other.show();
    }
}
