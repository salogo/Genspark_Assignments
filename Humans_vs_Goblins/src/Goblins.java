public class Goblins {
    private int strength;
    private int health = 10;
    // Constructor
    public Goblins(int strength, int health){
        this.strength = strength;
        this.health = health;
    }
    // Default Constructor
    public Goblins() {
    }
    // Getters
    public int getHealth() {
        return health;
    }
    public int getStrength() {
        return strength;
    }
    // Setters
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    //Overriding to String Humans methode
    @Override
    public String toString(){
        return "G";
    }
    // Goblins methode
    public String attack( Humans humans){
       setHealth(getHealth() +2);

        humans.setHealth(humans.getHealth() -strength);

        if (humans.getHealth() <= 0 ){
            return "Humans has died ";
        } else {
            return humans.attack(this);// this here human because it is in human object
        }

    }

    public static void main(String[] args) {
        System.out.println("hello world..");
    }

}
