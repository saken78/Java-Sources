package interface1;

public class Penyihir implements BisaMenyerang {
    String nama;

    Penyihir(String nama) {
        this.nama = nama;
    }

    public void serang() {
        System.out.println(nama + " Menyerang dengan sihir");
    }

}
