
/* 🎯 Deskripsi:

Buat program Java yang memiliki:
🔷 Abstract Class Karakter

    Atribut:

        String nama

    Constructor

    Method abstract:

        aksi() → tiap karakter punya aksi berbeda

    Method biasa:

        info() → tampilkan nama karakter

🔶 Subclass:

    Petarung → isi method aksi() dengan: "Menyerang dengan pedang!"

    Penyihir → isi method aksi() dengan: "Mengeluarkan sihir api!"

    Pemanah → isi method aksi() dengan: "Menembakkan panah dari jauh!" */
import java.util.Scanner;

abstract class Karakter {
    public String nama;

    Karakter(String nama) {
        this.nama = nama;
    }

    abstract void aksi();

    void info() {
        System.out.println("Nama : " + nama);
    }
}

class Petarung extends Karakter {

    Petarung(String nama) {
        super(nama);
    }

    void info() {
        System.out.println("Nama : " + nama);
    }

    @Override
    void aksi() {
        System.out.println("Menyerang dengan pedang");
    }
}

class Penyihir extends Karakter {

    Penyihir(String nama) {
        super(nama);
    }

    void info() {
        System.out.println("Nama : " + nama);
    }

    @Override
    void aksi() {
        System.out.println("Mengeluarkan sihi api!!");
    }
}

class Pemanah extends Karakter {

    Pemanah(String nama) {
        super(nama);
    }

    void info() {
        System.out.println("Nama : " + nama);
    }

    @Override
    void aksi() {
        System.out.println("Menembakkan panah!!");
    }
}

public class abstarct {
    /*
     * Buat array Karakter[] tim = new Karakter[3]
     * 
     * Isi dengan objek dari 3 subclass
     * 
     * Loop array dan jalankan info() dan aksi() untuk setiap karakter
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Karakter[] tim = new Karakter[3];

        for (int i = 0; i < tim.length; i++) {
            System.out.print("pilih role : ");
            String role = inputUser.nextLine();

            System.out.print("masukan nama : ");
            String nama = inputUser.nextLine();

            if (role.equalsIgnoreCase("pemanah")) {
                tim[i] = new Pemanah(nama);
            } else if (role.equalsIgnoreCase("petarung")) {
                tim[i] = new Petarung(nama);
            } else if (role.equalsIgnoreCase("penyihir")) {
                tim[i] = new Penyihir(nama);
            } else {
                System.out.println("pilihan tidak ada ");
                System.out.println("Default!!");
            }
        }

        for (Karakter fishchips : tim) {
            fishchips.info();
            fishchips.aksi();
        }

    }

}
