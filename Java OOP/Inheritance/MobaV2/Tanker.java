//package inheritance.Moba;

public class Tanker extends Hero implements IBuff {
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
    public void attack(Hero enemy) throws ExceptionHealth {
        // jika damagae <= 0
        if (this.getPhysicalAttack() <= 0) {
            System.err.println("Damage anda 0 !!!");
        }
        // jika hp <= 0
        if (this.getHealth() <= 0) {
            throw new ExceptionHealth("Karakter Mati , Tidak bisa menyerang");
        } else {
            if (enemy.isAlive()) {
                System.out
                        .println(GameUtils.RED + "[Tanker] " + this.getNama() + " melempar " + enemy.getNama() + "! 💀"
                                + GameUtils.RESET);
                enemy.takeDamagedPhysic(this.getPhysicalAttack());
            } else {
                System.out.println(GameUtils.YELLOW + enemy.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
            }
        }
    }

    @Override // method hero
    protected void show() {
        super.show();
        System.out.println("Defence\t: " + this.physicalDefence);
        System.out.println("Type\t: " + this.type);
    }

    // interface
    @Override
    public void takeDamagedMagic(double magicPowerInput) {
        double defence = magicPowerInput - this.physicalDefence;
        // jika defence <= 0
        if (defence <= 0) {
            defence = 0;
        }
        this.setHealthAttack(defence);
        System.out.println(this.getNama() + " menerima " + magicPowerInput + " damage! Sisa HP: " + this.getHealth());
        if (!isAlive()) {
            System.out.println(GameUtils.YELLOW + this.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
        }
    }

    // method hero
    @Override
    public void takeDamagedPhysic(double physicalAttack) {
        double defence = physicalAttack - this.physicalDefence;
        if (defence <= 0) {
            defence = 0;
        }
        this.setHealthAttack(defence);
        System.out.println(this.getNama() + " menerima " + physicalAttack + " damage! Sisa HP: " + this.getHealth());
        if (!isAlive()) {
            System.out.println(GameUtils.YELLOW + this.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
        }
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
        this.setIncreasePhysicalDefence(40);
    }
}
