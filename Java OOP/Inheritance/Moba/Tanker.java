package inheritance.Moba;

public class Tanker extends Hero {
    private String type = "Tanker";
    private double physicalDefence = 40;

    Tanker(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        this.health -= defence;

    }

}


