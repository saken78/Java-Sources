package inheritance.Moba;

public class Assasin extends Hero implements IAttack, IBuff {
    private String Type = "Assasin";
    private double physicalDefence = 5;

    Assasin(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override // interface
    public void buff() {
        this.setIncreaseBasicAttack(80);
        System.out.println("\n" + this.getNama() + " mendapatkan buff physical attack " + this.getBasicAttack());
    }

    @Override // interface
    public void attack(Hero enemy) {
        System.out.println("\n" + this.getNama() + " attacking " + enemy.getNama());
        enemy.takeDamagedPhysic(this.getBasicAttack());
    }

    @Override // method hero
    protected void show() {
        super.show();
        System.out.println("Attack\t: " + this.getBasicAttack());
        System.out.println("Type\t: " + this.Type);
    }

    public void takeDamagedPhysic(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    public void takeDamagedMagic(double magicPowerInput) {
        double defence = magicPowerInput - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(2);
    }

}
