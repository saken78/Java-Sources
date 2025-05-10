package abstract2;

/* 📌 Soal:

    Buat abstract class bernama Transportasi

        Atribut:

            protected String nama

        Constructor

        Method:

            public abstract void bergerak();

            public void info() → cetak nama transportasi

    Buat 2 subclass:

        Mobil → isi bergerak() dengan: "Mobil melaju di jalan raya."

        Kapal → isi bergerak() dengan: "Kapal berlayar di lautan."

    Di main():

        Buat array Transportasi[] list = new Transportasi[2];

        Isi dengan objek Mobil dan Kapal

        Loop array dan panggil info() dan bergerak() → Polymorphism */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        Transportasi[] list = new Transportasi[2];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Masukan jenis nya yahhhhhhh : ");
            String jenis = ip.nextLine();
            if (jenis.equalsIgnoreCase("mobil")) {
                String nama = ip.nextLine();
                list[i] = new Mobil(nama);

            } else if (jenis.equalsIgnoreCase("kapal")) {
                String nama = ip.nextLine();
                list[i] = new Kapal(nama);

            } else {
                System.out.println("Default");
                System.out.println("out of list");
            }
        }
        for (Transportasi transportasi : list) {
            transportasi.info();
            transportasi.bergerak();
        }

    }

}
