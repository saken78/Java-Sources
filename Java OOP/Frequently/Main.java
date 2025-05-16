package Mode;

/* Kamu punya banyak angka (input dari user), lalu program harus:

    Menghitung berapa kali setiap angka muncul (frekuensi)

    Menampilkan angka yang paling sering muncul */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Masukan berapa angka yang ingin kamu masukkan : ");
        int many = inputUser.nextInt();

        for (int i = 1; i <= many; i++) {
            System.out.print("Masukkan angka ke-" + i + " :");
            int IO = inputUser.nextInt();
            numbers.add(IO);
        }
        System.out.println();

        Mode ancient = new Mode(numbers);
        ancient.mode();
    }
}
