import java.util.Scanner;

class NumberAnalyzer {
    private int[] numbers;

    public NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;

    }

    // method: hitung ganjil
    public void countOdd() {
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd);
    }

    // method: hitung genap
    public void countEven() {
        int even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
    }

    // method: tampilkan semua angka
    public void showNumbers() {
        System.out.println("\nAngka dalam array : ");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }

        System.out.print("\njumlah angka ganjil\t: ");
        countOdd();
        System.out.print("Jumlah angka genap\t: ");
        countEven();

    }
}

public class naz {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan berapa angka\t: ");
        int index = inputUser.nextInt();
        int[] numbers = new int[index];

        for (int i = 0; i < index; i++) {
            System.out.print("masukan angka ke-" + (i + 1) + " : ");
            numbers[i] = inputUser.nextInt();

        }

        NumberAnalyzer ar1 = new NumberAnalyzer(numbers);
        ar1.showNumbers();

    }

}
