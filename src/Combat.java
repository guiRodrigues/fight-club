import java.util.Random;

public class Combat {

    private Random rand = new Random();

    //    ATTRIBUTES
    private Fighter challenged;
    private Fighter challenger;
    private int rounds;
    private boolean approved;

////    CONSTRUCTOR
//    Combat(){
//
//    }

    //    PUBLIC METHODS
    void markCombat( Fighter f1, Fighter f2 ){
        if ( f1.getCategory().equals(f2.getCategory()) && f1!=f2 ){
            setApproved(true);
        } else {
            setApproved(false);
        }
        setChallenged(f1);
        setChallenger(f2);
    }

    void combat(){
        if (isApproved()){
            this.getChallenged().present();
            this.getChallenger().present();
            int winner = rand.nextInt(3);
            String blow = (winner==0) ? "Flying Knee" : "Direct JAB";
            System.out.println("\nFIGHT RESULTS:");
            switch (winner){
                case 0:
                    System.out.println("The fighter " + this.getChallenged().getName() + " WIN with a " + blow + ".");
                    this.getChallenged().winFight();
                    this.getChallenger().loseFight();
                    this.getChallenged().status();
                    break;
                case 1:
                    System.out.println("The fighter " + this.getChallenger().getName() + " WIN with a " + blow + ".");
                    this.getChallenger().winFight();
                    this.getChallenged().loseFight();
                    this.getChallenger().status();
                    break;
                case 2:
                    System.out.println("The fight was tied!");
                    this.getChallenged().drawFight();
                    this.getChallenger().drawFight();
                    this.getChallenged().status();
                    this.getChallenger().status();
            }
        } else {
            System.out.print("The fight cannot happen : ");
            if ( !(this.getChallenged().getCategory().equals(this.getChallenger().getCategory())) )
                System.out.println("Different categories.");
            else
                System.out.println("The fighter cannot fight with himself. It's not a FIGHT CLUB!");
        }
    }

//    SPECIAL METHODS

    public Fighter getChallenged() {
        return challenged;
    }

    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenger() {
        return challenger;
    }

    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

}