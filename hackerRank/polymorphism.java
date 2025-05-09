
/*
 * Struktur:
 * 1. Class Induk: Pesawat
 * 
 * Atribut:
 * 
 * String nama
 * 
 * Method:
 * 
 * terbang() → default: "Pesawat sedang lepas landas..."
 * 
 * 2. Class Turunan:
 * 
 * PesawatTempur → override terbang() dengan
 * "Pesawat tempur melesat dengan kecepatan tinggi!"
 * 
 * PesawatKomersial → override terbang() dengan
 * "Pesawat komersial membawa penumpang dengan tenang."
 */
import java.util.Scanner;

class Pesawat {
    public String nama;

    Pesawat(String nama) {
        this.nama = nama;
    }

    void terbang() {
        System.out.println("Pesawat sedang lepas landas");
    }
}

class PesawatTempur extends Pesawat {

    PesawatTempur(String nama) {
        super(nama);
    }

    @Override
    void terbang() {
        System.out.println("Pesawat tempur sedang melesat dengan kecepatan tinggi");
    }
}

class PesawatKomersial extends Pesawat {

    PesawatKomersial(String nama) {
        super(nama);
    }

    @Override
    void terbang() {
        System.out.println("Pesawat komersil membawa penumpang dengan tenang");
    }
}

class polymor {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Pesawat[] hangar = new Pesawat[3];

        for (int i = 0; i < hangar.length; i++) {
            hangar[i] = inputUser.nextLine();
        }
    }
}
