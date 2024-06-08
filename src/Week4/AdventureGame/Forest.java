package Week4.AdventureGame;

public class Forest extends BattelLoc {

    public Forest (Player player) {
        super("Orman" , player , new Vampire(), "odun",3);
    }

    @Override
    public boolean allEnemiesDefeated() {
        return false;
    }
}
