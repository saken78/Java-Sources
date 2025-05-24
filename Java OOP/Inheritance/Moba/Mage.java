package inheritance.Moba;

public class Mage extends Hero {
    private String type = "Mage";
    private double magicPower = basicAttack * 3;
    private double physicalDefence = 5;

    Mage(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Magic\t: " + this.magicPower);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        this.health -= defence;

    }

}


