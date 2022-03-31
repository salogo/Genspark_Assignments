
public class Humans {
    private int strength;
    private int health;

    public Humans(int strength, int health){
        this.strength = strength;
        this.health = health;
    }
    // Default Constructor
    public Humans() {
        setHealth(10);
        setStrength(10);
    }
    // getters of the fields
    public int getHealth(){
        return health;
    }
    public int getStrength(){

        return health;
    }
    // setters og the fields
    public void setHealth(int health){

        this.health = health;
    }
    public void setStrength(int strength){

        this.strength = strength;
    }
    //Overriding to String Humans methode
    @Override
    public String toString(){
        return "Constructor(" +
                "health=" + health +
                ", strength=" + strength +
                ')' ;
    }
    // Humans methode
    public String attack(Goblins goblins){


        goblins.setHealth(goblins.getHealth() - strength);

        if (goblins.getHealth() <= 0 ){
            return "Goblins died.. ";
        } else {
            return goblins.attack(this);// this here human because it is in human object
        }

    }


    public static void main(String[] args) {
    }



}

