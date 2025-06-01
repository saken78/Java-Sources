//package inheritance.Moba;

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
                System.out
                        .println(GameUtils.RED + "[Mage] " + this.getNama() + " melempar bola api "
                                + enemy.getNama() + "! 💀"
                                + GameUtils.RESET);
                enemy.takeDamagedMagic(this.getMagicPower());
            } else {
                System.out.println(GameUtils.YELLOW + enemy.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
            }
        }
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
        this.setHealthAttack(magicPowerInput);
        System.out.println(this.getNama() + " menerima " + magicPowerInput + " damage! Sisa HP: " + this.getHealth());
        if (!isAlive()) {
            System.out.println(GameUtils.YELLOW + this.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
        }
    }

    @Override
    public void takeDamagedPhysic(double basicPhysicalInput) {
        // double defence = basicAttackInput;
        this.setHealthAttack(basicPhysicalInput);
        System.out
                .println(this.getNama() + " menerima " + basicPhysicalInput + " damage! Sisa HP: " + this.getHealth());
        if (!isAlive()) {
            System.out.println(GameUtils.YELLOW + this.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
        }
    }

    @Override
    public void levelUp() {
        this.setLevelUp(1);
        this.setHealthIncrease(100);
    }
}
