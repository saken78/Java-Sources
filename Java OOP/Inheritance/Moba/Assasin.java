package inheritance.Moba;

public class Assasin extends Hero {
    private String Type = "Assasin";
    private double physicalDefence = 5;

    Assasin(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    protected void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Attack\t: " + this.basicAttack);
        System.out.println("Type\t: " + this.Type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        this.health -= defence;
    }

}


