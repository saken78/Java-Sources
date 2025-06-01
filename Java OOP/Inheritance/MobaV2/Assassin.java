//package inheritance.Moba;

public class Assassin extends Hero implements IBuff, ISkill {
    private String Type = "Assasin";
    private double physicalDefence = 5;

    Assassin(String namaInput, double healthInput, double physicalAttackInput) {
        super(namaInput, healthInput, physicalAttackInput);
    }

    @Override // interface
    public void buff() {
        this.setIncreasePhysicalAttack(80);
        System.out.println("\n" + this.getNama() + " mendapatkan buff physical attack " + this.getPhysicalAttack());
    }

    @Override // interface
    public void attack(Hero enemy) throws ExceptionHealth {
        if (this.getPhysicalAttack() <= 0) {
            System.err.println("Damage anda 0 !!!");
        }
        if (this.getHealth() <= 0) {
            throw new ExceptionHealth("Karakter Mati , Tidak bisa menyerang");

        } else {
            if (enemy.isAlive()) {
                System.out.println(GameUtils.RED + "[Assassin] " + this.getNama() + " menusuk " + enemy.getNama()
                        + "! 💀" + GameUtils.RESET);
                enemy.takeDamagedPhysic(this.getPhysicalAttack());
            } else {
                System.out.println(GameUtils.YELLOW + enemy.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
            }
        }
    }

    @Override
    // interface
    public void useSkill(Hero target) {
        System.out.println(GameUtils.RED + "[Skill] " + this.getNama() + " menggunakan Shadow Dash ke "
                + target.getNama() + "!" + GameUtils.RESET);
        target.takeDamage(this.getPhysicalAttack() * 2); // Skill ganda
    }

    @Override // method hero
    protected void show() {
        super.show();
        System.out.println("Attack\t: " + this.getPhysicalAttack());
        System.out.println("Type\t: " + this.Type);
    }

    @Override
    // dari method hero
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

    @Override
    // dari method hero
    public void takeDamagedMagic(double magicPowerInput) {
        double defence = magicPowerInput - this.physicalDefence;
        if (defence <= 0) {
            defence = 0;
        }
        this.setHealthAttack(defence);
        System.out.println(this.getNama() + " menerima " + magicPowerInput + " damage! Sisa HP: " + this.getHealth());
        if (!isAlive()) {
            System.out.println(GameUtils.YELLOW + this.getNama() + " telah dikalahkan! 💀" + GameUtils.RESET);
        }
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(1);
        this.setIncreasePhysicalAttack(30);
    }

}
