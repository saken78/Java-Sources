package inheritance.Moba;

public class Fighter extends Hero implements IAttack, IBuff {
    private String type = "Fighter";
    private double physicalDefence = 20;

    Fighter(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override // interface
    public void buff() {
        this.setIncreasePhysicalDefence(70);
        System.out.println("\n" + this.getNama() + " mendapatkan buff physichal defense " + this.getPhysicalDefence());
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

    @Override // method hero
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);

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
        this.setLevelUp(1);
    }

}
