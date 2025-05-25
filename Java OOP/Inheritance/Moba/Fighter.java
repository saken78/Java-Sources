package inheritance.Moba;

public class Fighter extends Hero {
    private String type = "Fighter";
    private double physicalDefence = 20;

    Fighter(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    protected void show() {
        System.out.println("\nNama\t: " + this.nama);
        System.out.println("Health\t: " + this.health);
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        this.health -= defence;

    }

}


