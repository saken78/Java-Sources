package inheritance.Moba;

public class Assasin extends Hero {
    private String Type = "Assasin";
    private double physicalDefence = 5;

    Assasin(String namaInput, double healthInput, double basicAttackInput) {
        super(namaInput, healthInput, basicAttackInput);
    }

    @Override
    protected void show() {
        super.show();
        System.out.println("Attack\t: " + this.getBasicAttack());
        System.out.println("Type\t: " + this.Type);
    }

    @Override
    protected void takeDamage(double basicAttack) {
        double defence = basicAttack - this.physicalDefence;
        System.out.println(this.getNama() + " menerima " + defence);
        this.setHealthAttack(defence);
    }

    // override method abstract
    @Override
    public void levelUp() {
        this.setLevelUp(2);
    }

    @Override
    public void specialAbillity() {
        this.setIncreaseBasicAttack(80);
        System.out.println("\n" + this.getNama() + " mendapatkan buff damage " + this.getBasicAttack());
    }

}


