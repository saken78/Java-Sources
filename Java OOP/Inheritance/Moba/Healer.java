package inheritance.Moba;

public class Healer extends Hero implements IBuff, IDebuff, IRegen {
    private String type = "Healer";

    Healer(String namaInput, double healthInput, double magicPowerInput) {
        super(namaInput, healthInput, magicPowerInput);
    }

    @Override
    public void regen() {
        this.setHealthIncrease(this.getHealth());
        System.out.println("\nHealer bisa heal HP 100% ++");
    }

    @Override // interface
    public void buff() {
        this.setHealthIncrease(12);
        System.out.println("\n" + this.getNama() + " mendapatkan buff health " + this.getHealth());
    }

    @Override // interface
    public void debuff() {
        this.setHealthIncrease(23);
        System.out.println("\n" + this.getNama() + " mendapatatkan debuff " + this.getHealth());
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Type\t: " + this.type);
    }

    @Override
    public void takeDamagedMagic(double magicPowerInput) {
        // double defence = magicPowerInput;
        // karena type mage tidak memiliki defence
        System.out.println(this.getNama() + " menerima " + magicPowerInput + " damage");
        this.setHealthAttack(magicPowerInput);
    }

    @Override
    public void takeDamagedPhysic(double basicAttackInput) {
        // double defence = basicAttackInput;
        System.out.println(this.getNama() + " menerima " + basicAttackInput);
        this.setHealthAttack(basicAttackInput);
    }

    @Override
    public void levelUp() {
        this.setLevelUp(1);
        this.setHealthIncrease(100);
    }
}
