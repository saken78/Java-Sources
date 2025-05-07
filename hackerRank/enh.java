class TeamF1 {
    public String team;
    public String negara;

    TeamF1(String team, String negara) {
        this.team = team;
        this.negara = negara;
    }

}

class PembalapF1 extends TeamF1 {
    public String nama;
    public int nomor;

    PembalapF1(String team, String negara, String nama, int nomor) {
        super(team, negara);
        this.nama = nama;
        this.nomor = nomor;
    }

    void perkenalan() {
        // Nomor 44 - Lewis Hamilton membalap untuk Mercedes (UK)
        System.out.println("Nomor " + nomor + " - " + nama + " pembalap untuk " + team + " (" + negara + ") ");
    }
}

public class enh {
    public static void main(String[] args) {
        /*
         * Buat array berisi beberapa PembalapF1 (minimal 3)
         * 
         * Panggil perkenalan() untuk masing-masing
         */
        PembalapF1 race1 = new PembalapF1("RedBull", "Netherlands", "Max Verstappen", 1);
        PembalapF1 race2 = new PembalapF1("Mercedes", "United Kingdom", "Lewis Hamilton", 3);
        PembalapF1 race3 = new PembalapF1("Mercedes", "Italy", "Kimi Antonelli", 2);
        race1.perkenalan();
        race2.perkenalan();
        race3.perkenalan();

    }

}
