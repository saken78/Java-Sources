package inheritance.Moba;

public class Tanker extends Hero implements IAttack, IBuff {
    private String type = "Tanker";
    private double physicalDefence;

    Tanker(String namaInput, double healthInput, double physicalDefenceInput2) {

        super(namaInput, healthInput, physicalDefenceInput2);
        this.physicalDefence = physicalDefenceInput2;
    }

    @Override // interface
    public void buff() {
        this.setIncreasePhysicalDefence(50);
        System.out.println("\n" + this.getNama() + " mendapatkan buff damage " + this.getMagicPower());
    }

    @Override // interface
    public void attack(Hero enemy) {
        System.out.println("\n" + this.getNama() + " attacking " + enemy.getNama());
        enemy.takeDamage(this.getBasicAttack());
    }

    @Override // method hero
    protected void show() {
        super.show();
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    // interface
    public void takeDamagedMagic(double magicPowerInput) {
        double defence = magicPowerInput - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    // method hero
    public void takeDamagedPhysic(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);

    }

}


