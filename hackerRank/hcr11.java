import java.util.Scanner;

public class hcr11 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("masukan jumlah mahasiswa : ");

        int n = userInput.nextInt();
        
        int[] angka = new int[n];

        for (int a = 0; a < n; a++) {
            angka[a] = userInput.nextInt();
        }
        System.out.println("panjang array " + angka.length);

        for (int b = n - 1; b >= 0; b--) {
            System.out.println(angka[b]);

        }

    }

}
