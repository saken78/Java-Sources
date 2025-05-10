package abstract2;

public class Mobil extends Transportasi {
    public Mobil(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " melaju di jalan raya");
    }
}
