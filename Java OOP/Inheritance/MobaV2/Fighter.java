//package inheritance.Moba;

public class Fighter extends Hero implements IBuff {
    private String type = "Fighter";
    private double physicalDefence = 20;

    Fighter(String namaInput, double healthInput, double physicalAttackInput) {
        super(namaInput, healthInput, physicalAttackInput);
    }

    @Override // interface
    public void buff() {
        this.setIncreasePhysicalDefence(70);
        System.out.println("\n" + this.getNama() + " mendapatkan buff physichal defense " + this.getPhysicalDefence());
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
                System.out
                        .println(GameUtils.RED + "[Fighter] " + this.getNama() + " menebas dengan pedang "
                                + enemy.getNama() + "! 💀"
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

    /*
     * @Override // method hero
     * protected void takeDamage(double physicalAttack) {
     * double defence = physicalAttack - this.physicalDefence;
     * if (defence <= 0) {
     * defence = 0;
     * }
     * System.out.println(this.getNama() + " menerima " + defence);
     * this.setHealthAttack(defence);
     * 
     * }
     */

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

    @Override
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
