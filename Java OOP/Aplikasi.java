package UTS;

import java.util.Scanner;

public class AplikasiNilaiMahasiswa {
    public static void main(String[] args) {
        // scanner
        Scanner inputUser = new Scanner(System.in);

        // Bikin variabel
        double nilaiAkhir = 0;
        double rataTugas = 0; // buat nampung rata-rata nilai tugas
        char grade = ' ';
        String keterangan = "";
        boolean mulai = true; // buat kondisi while ny

        // kosmetik aplikasi
        System.out.println("===== APLIKASI NILAI MAHASISWA =====");

        /*
         * kalau aplikasi saya lebih suka dengan while
         * biar terus lanjut sampai dengan user sendiri yang menginginkan keluar dari
         * program
         */

        /*
         * saya buat variable nya di luar karena biar jadi variable global
         * kalau di dalem while nanti akan jadi variable lokal yang tidak bisa digunkan
         * di luar while nya
         */

        /*
         * nim nya aku buat dengan string soalnya kalau int ada maksimal nya biar hemat
         * memori , jadi aku buat dengan string aja
         */
        String nim = "";
        String nama = "";
        String matkul = "";
        int nilaiUTS = 0;
        int nilaiUAS = 0;

        while (mulai) {
            // Tampilkan menu
            System.out.println("\n==== MENU ====");
            System.out.println("1. Input Nilai");
            System.out.println("2. Lihat Hasil");
            System.out.println("3. Keluar");
            System.out.print("Silahaksn pilih (1-3): ");

            int pilihan = inputUser.nextInt();
            inputUser.nextLine();
            // Bersihin buffer supaya ad nextline nya

            if (pilihan == 1) {
                // inputan dari user nya
                System.out.println("\n-- INPUT DATA --");

                System.out.print("NIM: ");
                nim = inputUser.nextLine();

                System.out.print("Nama: ");
                nama = inputUser.nextLine();

                System.out.print("Mata Kuliah: ");
                matkul = inputUser.nextLine();

                // Tambahan dari soal: jumlah tugas dan input perulangan
                System.out.print("Jumlah Tugas: ");
                int jumlahTugas = inputUser.nextInt();

                int totalTugas = 0;

                /*
                 * Ini saya pakai loop biar input nilai tugasnya sesuai jumlah tugas yang
                 * diinput user, sesuai dengan permintaan studi kasus UTS
                 */
                for (int i = 1; i <= jumlahTugas; i++) {
                    System.out.print("Nilai Tugas ke-" + i + ": ");
                    int nilai = inputUser.nextInt();
                    totalTugas += nilai;
                }

                // hitung rata-rata nilai tugas
                rataTugas = jumlahTugas > 0 ? (double) totalTugas / jumlahTugas : 0;

                System.out.print("Nilai UTS: ");
                nilaiUTS = inputUser.nextInt();

                System.out.print("Nilai UAS: ");
                nilaiUAS = inputUser.nextInt();

                // hitung nilai akhir
                nilaiAkhir =
                        // perhitungan nilai akhir nya
                        (rataTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);

                // Tentuin gradeNYA
                if (nilaiAkhir >= 85) {
                    grade = 'A';
                } else if (nilaiAkhir >= 70) {
                    grade = 'B';
                } else if (nilaiAkhir >= 55) {
                    grade = 'C';
                } else if (nilaiAkhir >= 40) {
                    grade = 'D';
                } else {
                    grade = 'E';
                }

                /*
                 * Ini tambahan dari soal juga: pakai ternary operator buat tentuin status lulus
                 * atau tidak
                 */
                keterangan = (nilaiAkhir >= 55) ? "LULUS" : "TIDAK LULUS";

                System.out.println("Data berhasil disimpan!");

            } else if (pilihan == 2) {
                // Lihat hasil dengan (method)
                tampilkanHasil(nim, nama, matkul, rataTugas, nilaiUTS, nilaiUAS, nilaiAkhir, grade, keterangan);

            } else if (pilihan == 3) {
                System.out.println("Terima kasih!");
                mulai = false;
            } else {
                System.out.println("Pilihan salah!");
            }
        }
    }

    /* aku pisahkan method untuk menampilkan hasil nya biar ga campur campur */

    public static void tampilkanHasil(String nim, String nama, String matkul, double rataTugas, int uts, int uas,
            double akhir, char grade, String keterangan) {
        System.out.println("\n-- HASIL NILAI --");

        if (nama.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            System.out.println("NIM: " + nim);
            System.out.println("Nama: " + nama);
            System.out.println("Mata Kuliah: " + matkul);
            System.out.printf("Rata-rata Tugas: %.2f\n", rataTugas);
            System.out.println("Nilai UTS: " + uts);
            System.out.println("Nilai UAS: " + uas);
            System.out.printf("Nilai Akhir: %.2f\n", akhir);
            System.out.println("Grade: " + grade);
            System.out.println("Keterangan: " + keterangan);
        }
    }
}
