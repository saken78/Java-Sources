import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionHealth {
        Scanner inputUser = new Scanner(System.in);
        ArrayList<Hero> kumpulanHero = new ArrayList<>();

        // Tambahkan hero dengan role spesifik
        kumpulanHero.add(new Assassin("Ling", 80, 100));
        kumpulanHero.add(new Mage("Lunox", 120, 70));
        kumpulanHero.add(new Mage("Alice", 100, 120));
        kumpulanHero.add(new Tanker("Atlas", 200, 20));
        kumpulanHero.add(new Fighter("Thamuz", 150, 40));
        kumpulanHero.add(new Healer("Rafaela", 90, 30));

        boolean isRunning = true;
        while (isRunning) {
            GameUtils.clearScreen();
            GameUtils.typewriter("=== 🎮 Moba Arena v2.0 🎮 ===", 50);
            GameUtils.typewriter("1. Attack Enemy", 50);
            GameUtils.typewriter("2. Use Skill", 50);
            GameUtils.typewriter("3. Display Heroes", 50);
            GameUtils.typewriter("4. Heal Team", 50);
            GameUtils.typewriter("5. Exit", 50);
            System.out.print("Choose action: ");
            String pilihan = inputUser.nextLine();

            switch (pilihan) {
                case "1": // Serang
                    Hero attacker = selectHero(kumpulanHero, inputUser, "Who attacks?");
                    Hero target = selectHero(kumpulanHero, inputUser, "Who to attack?");

                    if (attacker != null && target != null && attacker.isAlive()) {
                        attacker.attack(target); // Polymorphism: attack() berbeda tiap hero
                        GameUtils.pause(10000);
                    }
                    break;

                case "2": // Skill Khusus
                    Hero hero = selectHero(kumpulanHero, inputUser, "Who uses skill?");
                    Hero heroSkilled = selectHero(kumpulanHero, inputUser, pilihan);
                    if (hero != null && hero.isAlive()) {

                    }
                    break;

                case "3": // Tampilkan semua hero
                    GameUtils.clearScreen();
                    System.out.println(GameUtils.YELLOW + "=== Hero Status ===" + GameUtils.RESET);
                    for (Hero hero1 : kumpulanHero) {
                        hero1.show();
                    }
                    GameUtils.pause(2000);
                    break;

                case "4": // Healing
                    Hero healer = selectHero(kumpulanHero, inputUser, "Who heals?");
                    Hero targetHeal = selectHero(kumpulanHero, inputUser, "Heal who?");
                    if (healer != null && targetHeal != null && healer.isAlive()) {
                        if (healer instanceof Healer) {
                            ((Healer) healer).regen(); // next Iregen ke semua type hero agar berfungsi
                        } else {
                            System.out.println(GameUtils.RED + "Only healers can heal!" + GameUtils.RESET);
                        }
                    }
                    break;

                case "5": // Keluar
                    isRunning = false;
                    GameUtils.typewriter(GameUtils.CYAN + "Goodbye! 🎮" + GameUtils.RESET, 50);
                    break;

                default:
                    System.out.println(GameUtils.RED + "Invalid choice!" + GameUtils.RESET);
            }
        }
        inputUser.close();
    }

    // Method untuk memilih hero berdasarkan input
    private static Hero selectHero(ArrayList<Hero> heroes, Scanner input, String prompt) {
        GameUtils.typewriter(prompt + " (Enter hero name): ", 50);
        String name = input.nextLine();
        Hero selected = null;

        for (Hero hero : heroes) {
            if (hero.getNama().equalsIgnoreCase(name)) {
                selected = hero;
                break;
            }
        }

        if (selected == null || !selected.isAlive()) {
            System.out.println(GameUtils.RED + "Hero tidak ditemukan atau sudah mati!" + GameUtils.RESET);
        }
        return selected;
    }
}
