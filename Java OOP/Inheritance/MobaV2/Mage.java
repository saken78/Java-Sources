//package inheritance.Moba;

public class Mage extends Hero implements IBuff, IDebuff, ISkill {
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
    public void attack(Hero enemy) throws ExceptionHealth {
        // jika damage <= 0
        if (this.getMagicPower() <= 0) {
            System.err.println("Damage anda 0 !!!");
        }
        // jika hp <= 0
        if (this.getHealth() <= 0) {
            throw new ExceptionHealth("Karakter Mati , Tidak bisa menyerang");
        } else {
            if (enemy.isAlive()) {
                System.out.println(GameUtils.RED + "[Mage] " + this.getNama() + " melempar bola api " + enemy.getNama()
                        + "! 💀" + GameUtils.RESET);
                enemy.takeDamagedMagic(this.getMagicPower());
            } else {
                System.out.println(GameUtils.YELLOW + enemy.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
            }
        }
    }

    @Override
    public void useSkill(Hero target) {
        System.out.println(GameUtils.BLUE + "[Skill] " + this.getNama() + " menggunakan Meteor Shower ke "
                + target.getNama() + "!" + GameUtils.RESET);
        target.takeDamage(this.getMagicPower() * 3); // Skill ganda
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Magic\t: " + this.getMagicPower());
        System.out.println("Type\t: " + this.type);
    }

    // interface
    @Override
    public void takeDamagedPhysic(double physicalAttack) {
        // karena type mage tidak memiliki defence
        // double defence = basicAttack;
        this.setHealthAttack(physicalAttack);
        System.out.println(this.getNama() + " menerima " + physicalAttack + " damage! Sisa HP: " + this.getHealth());
    }

    // interface
    @Override
    public void takeDamagedMagic(double magicPowerInput) {
        // double defence = magicPowerInput;
        // karena type mage tidak memiliki defence
        this.setHealthAttack(magicPowerInput);
        System.out
                .println(this.getNama() + " menerima " + magicPowerInput + " damage! Sisa HP: " + this.getHealth());

    }

    // interface
    @Override
    public void debuff() {
        this.setDecreaseMagicPower(30);
        System.out.println(" \n" + this.getNama() + " menerima debuff " + this.getMagicPower());
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
        this.setIncreaseMagicPower(30);
    }
}
