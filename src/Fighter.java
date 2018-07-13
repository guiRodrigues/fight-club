public class Fighter implements Fight {

    //    ATTRIBUTES
    private String name;
    private String nationality;
    private int age;
    private double height;
    private double weight;
    private String category;
    private int victories;
    private int defeats;
    private int draws;

//    METHODS

    //    Constructor
    Fighter(String name, String nationality, int age, double height, double weight, int victories, int defeats, int draws){
        setName(name);
        setNationality(nationality);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        setCategory(weight);
        setVictories(victories);
        setDefeats(defeats);
        setDraws(draws);
    }

//    Getters and Setters

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(double weight) {
        if ( (weight<52.2) && (weight>120.2))
            this.category = "Invalid";
        else {
            if (weight<=70.3)
                this.category = "Light";
            else if (weight<=83.9)
                this.category = "Medium";
            else
                this.category = "Heavy";
        }
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDefeats() {
        return defeats;
    }

    public void setDefeats(int defeats) {
        this.defeats = defeats;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public void present() {
        System.out.println("\nITs TIME!");
        System.out.println("From " + this.getNationality() + " he have " + this.getAge() + " years old from category "+ this.getCategory() +", his height is " + this.getHeight() + "M, " + this.getWeight() + "KG,  and with " + this.getVictories() + " victories, " + this.getDefeats() + " defeats and " + this.getDraws() + " draws, he is " + this.getName() + "!");
    }

    public void status(){
        System.out.println("\nName = " + this.getName() + ", " + this.getNationality() + ", win = " + this.getVictories() + ", defeats = " + this.getDefeats() + ", draws = " + this.getDraws());
    }

    public void winFight() {
        this.setVictories( this.getVictories()+1 );
    }

    public void loseFight() {
        this.setDefeats( this.getDefeats()+1 );
    }

    public void drawFight() {
        this.setDraws( this.getDraws()+1 );
    }

}