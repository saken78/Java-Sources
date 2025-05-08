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
class Pesawat {
    public String nama;

    Pesawat(String nama) {
        this.nama = nama;
    }

    void terbang() {
        System.out.println("Pesawat sedang lepas landas");
    }
}

class polymor {
    public static void main(String[] args) {
        System.out.println("sye");
    }
}
