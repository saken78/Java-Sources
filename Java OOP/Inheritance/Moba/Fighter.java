package inheritance.Moba;

public class Fighter extends Hero {
    private String type = "Fighter";
    private double physicalDefence = 20;

    Fighter(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        this.setHealthAttack(defence);

    }

    // override method abstract
    public void levelUp() {
        this.setLevelUp(1);
    }

}

