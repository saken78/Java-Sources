package inheritance.Moba;

public class Mage extends Hero {
    private String type = "Mage";
    private double magicPower;
    private double physicalDefence = 5;

    Mage(String namaInput, double healthInput, double magicPowerInput) {
        super(namaInput, healthInput, magicPowerInput);

        this.magicPower = this.getBasicAttack();
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Magic\t: " + this.magicPower);
        System.out.println("Type\t: " + this.type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);

    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
    }

    @Override
    public void specialAbillity() {
        // increasing through damage
        this.setIncreaseMagicPower(50);
        System.out.println("\n" + this.getNama() + " mendapatkan buff damage " + this.getMagicPower());
    }

}
