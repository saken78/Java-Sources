import java.util.Scanner;

public class hcr2 {
    public static void main(String[] args) {

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan angka 1-20 : ");

        // inputan nya ku simpan di variable x
        int x = inputUser.nextInt();

        // validasi aja suapya tidak ada angka yang melebihi 20 dan kurng dari 1
        if (x < 1 || x > 20) {
            System.err.println("Masukan angka yang sesuai perintah");

        } else {
            // for yang ini untuk membuat segitiga diagonal bawah nya
            for (int a = 1; a <= x; a++) {
                for (int y = 1; y <= a; y++) {
                    System.out.print(" " + y);
                }
                System.out.println();
            }
            // yang for ini untuk membuat info nya apakah ganjil/genap
            System.out.println("\nNumber Info : ");
            for (int b = 1; b <= x; b++) {

                // genap % 5
                if (b % 2 == 0 && b % 5 == 0) {
                    System.out.println(b + " is even and multiple by 5");

                    // genap aja
                } else if (b % 2 == 0) {
                    System.out.println(b + " is even");

                    // ganjil & 5
                } else if (b % 2 != 0 && b % 5 == 0) {
                    System.out.println(b + " is odd and multiple by 5");

                    // ganjil aja
                } else if (b % 2 != 0) {
                    System.out.println(b + " is odd ");
                }

            }
        }

    }
}
