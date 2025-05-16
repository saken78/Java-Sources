package Guessing;
/* Buat program yang:

    Menerima deretan angka dari user

    Mengecek:

        Mana bilangan genap

        Mana bilangan ganjil

        Mana bilangan kelipatan 3 dan 5

    Menampilkan ringkasan hasil

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("masukan berapa angka yang ingin anda cek: ");
        int jumlah = inputUser.nextInt();

        for (int i = 0; i <= jumlah; i++) {
            int number = inputUser.nextInt();
            numbers.add(number);
        }

        NumberAnalyzer chchking = new NumberAnalyzer(numbers);
        chchking.checking();
        chchking.even();
        chchking.threefive();

    }
}
