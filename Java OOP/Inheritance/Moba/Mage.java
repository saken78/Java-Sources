package inheritance.Moba;

public class Mage extends Hero implements IAttack, IBuff, IDebuff {
    private String type = "Mage";
    private double magicPower;

    Mage(String namaInput, double healthInput, double magicPowerInput) {
        super(namaInput, healthInput, magicPowerInput);

        this.magicPower = this.getBasicAttack();
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
        System.out.println("Magic\t: " + this.magicPower);
        System.out.println("Type\t: " + this.type);
    }

    // interface
    public void takeDamagedPhysic(double basicAttack) {
        double defence = basicAttack;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    // interface
    public void takeDamagedMagic(double magicPowerInput) {
        double defence = magicPowerInput;
        System.out.println(this.getNama() + " menerima " + defence + " damage");
        this.setHealthAttack(defence);
    }

    public void debuff() {
        this.setDecreaseMagicPower(30);
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
    }

}


