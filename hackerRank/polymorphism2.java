
/*1. Superclass: Senjata

    Atribut:

        String nama

    Method:

        serang() → default: "Senjata menyerang musuh biasa..."

2. Subclass:

    Pedang → override serang() → "Pedang menebas dengan kuat!"

    Panah → override serang() → "Panah meluncur ke arah target!"

    LaserGun → override serang() → "Laser menyala: *ziiiing!*" */
import java.util.Scanner;

class Weapon {
    public String nama;

    Weapon(String nama) {
        this.nama = nama;
    }

    void serang() {
        System.out.println(nama + " menyerang musuh biasa ");
    }

}

class Pedang extends Weapon {

    Pedang(String nama) {
        super(nama);
    }

    @Override
    void serang() {
        System.out.println(nama + " menembus dengan kuat");
    }

}

class Panah extends Weapon {

    Panah(String nama) {
        super(nama);
    }

    @Override
    void serang() {
        System.out.println(nama + " meluncur ke arah target");
    }
}

class LaserGun extends Weapon {

    LaserGun(String nama) {
        super(nama);
    }

    @Override
    void serang() {
        System.out.println(nama + " menyala: *ziiiing!*");
    }

}

public class polymor2 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Weapon[] ghost = new Weapon[3];

        for (int i = 0; i < ghost.length; i++) {
            System.out.print("Pedang / Panah / Laser Gun : ");
            String jenis = inputUser.nextLine();

            System.out.print("Nama : ");
            String nama = inputUser.nextLine();

            if (jenis.equalsIgnoreCase("pedang")) {
                ghost[i] = new Pedang(nama);
            } else if (jenis.equalsIgnoreCase("panah")) {
                ghost[i] = new Panah(nama);
            } else if (jenis.equalsIgnoreCase("laser gun")) {
                ghost[i] = new LaserGun(nama);
            } else {
                System.out.println("Pilihan tidak ditemukan : beralih ke senjata default");
                ghost[i] = new Weapon(nama);
            }
        }

        for (Weapon senjata : ghost) {
            senjata.serang();
        }

    }

}
