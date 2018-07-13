public class FightClub {
    public static void main(String[] args) {

        int size=6;

        Fighter fighter[] = new Fighter[size];
        Combat mortalKombat = new Combat();

        fighter[0] = new Fighter("Pretty Boy", "France", 31, 1.75, 68.9, 11, 2, 1);
        fighter[1] = new Fighter("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        fighter[2] = new Fighter("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        fighter[3] = new Fighter("Dead Code", "Australia", 28, 1.93, 81.6, 13, 0, 2);
        fighter[4] = new Fighter("UFOCobol", "Brasil", 37, 1.70, 119.7, 5, 4, 3 );
        fighter[5] = new Fighter("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);

        mortalKombat.markCombat(fighter[0], fighter[1]);
//        mortalKombat.markCombat(fighter[0], fighter[5]); // *ERROR*: Different Categories
//        mortalKombat.markCombat(fighter[0], fighter[0]); // *ERROR*: Same fighter
        mortalKombat.combat();

    }
}
