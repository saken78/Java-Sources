package interface1;

public class Petarung implements BisaMenyerang {
    String nama;

    Petarung(String nama) {
        this.nama = nama;
    }

    public void serang() {
        System.out.println(nama + " Menyerang dengan pedang");
    }
}
