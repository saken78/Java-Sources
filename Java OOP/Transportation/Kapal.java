package abstract2;

public class Kapal extends Transportasi {

    public Kapal(String nama) {
        super(nama);
    }

    @Override
    public void bergerak() {
        System.out.println(nama + " berlayar di lautan");
    }

}
