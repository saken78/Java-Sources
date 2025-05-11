package interface1;

public class Robot implements BisaMenyerang {
    String nama;

    Robot(String nama) {
        this.nama = nama;
    }

    public void serang() {
        System.out.println(nama + " Menyerang dengan laser beam");
    }

}
