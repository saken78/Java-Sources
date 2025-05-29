package inheritance.Moba;

public class Mage extends Hero implements IAttack, IBuff, IDebuff {
    private String type = "Mage";

    Mage(String namaInput, double healthInput, double magicPowerInput) {
        super(namaInput, healthInput, magicPowerInput);
        // this.magicPower = this.getBasicAttack();
    }

    @Override // interface
    public void buff() {
        this.setIncreaseMagicPower(40);
        System.out.println("\n" + this.getNama() + " mendapatkan buff damage " + this.getMagicPower());
    }

    @Override // interface
    public void attack(Hero enemy) {
        System.out.println("\n" + this.getNama() + " attacking " + enemy.getNama());
        enemy.takeDamagedMagic(this.getMagicPower());
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Magic\t: " + this.getMagicPower());
        System.out.println("Type\t: " + this.type);
    }

    // interface
    public void takeDamagedPhysic(double basicAttackInput) {
        // karena type mage tidak memiliki defence
        // double defence = basicAttack;
        System.out.println(this.getNama() + " menerima " + basicAttackInput);
        this.setHealthAttack(basicAttackInput);
    }

    // interface
    public void takeDamagedMagic(double magicPowerInput) {
        // double defence = magicPowerInput;
        // karena type mage tidak memiliki defence
        System.out.println(this.getNama() + " menerima " + magicPowerInput + " damage");
        this.setHealthAttack(magicPowerInput);
    }

    public void debuff() {
        this.setDecreaseMagicPower(30);
        System.out.println(" \n" + this.getNama() + " menerima debuff " + this.getMagicPower());
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
    }

}
