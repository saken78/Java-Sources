package Attacker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("🎮 Pertarungan Dimulai!");

        System.out.print("Masukkan nama karakter 1: ");
        String nama1 = input.nextLine();
        System.out.print("Masukkan nama karakter 2: ");
        String nama2 = input.nextLine();

        Karakter p1 = new Karakter(nama1, 100, 20);
        Karakter p2 = new Karakter(nama2, 100, 20);

        System.out.println("\n== Arena Pertarungan ==");
        p1.showStatus();
        p2.showStatus();
        System.out.println();

        while (p1.isAlive() && p2.isAlive()) {
            p1.attack(p2);
            if (p2.isAlive()) {
                p2.attack(p1);
            }

            System.out.println();
            p1.showStatus();
            p2.showStatus();
            System.out.println("----------");

            try {
                Thread.sleep(1000); // delay biar dramatis
            } catch (Exception e) {
            }
        }

        System.out.println("\n🔥 Pemenang: " + (p1.isAlive() ? p1.getNama() : p2.getNama()) + "!!!");
    }
}
