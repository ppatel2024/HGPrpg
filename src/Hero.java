import java.util.Arrays;
import java.util.Random;

public class Hero {
    //Attributes
    private int health;
    private int magLevel;
    private String name;
    public String[] inventory = new String[10];
    private int toonieLevel;
    private int ratTail;
    private int spiderEye;
    private int flyWing;


    //Constructor
    Hero() {
        this.health = 100;
        this.name = "Atom";
        this.inventory[0] = null;
        this.magLevel = 0;
        this.toonieLevel = 50;
    }

    //Helper Method
    void attack(Enemy e) { //e BECOMES e1, or e2, or e3
        int tempH = e.getHealth() - 10;
        e.setHealth(tempH);
    }

    void magAttack(Enemy e) { //e BECOMES e1, or e2, or e3
        int tempH = e.getHealth() - 30;
        e.setHealth(tempH);
    }
        //Methods

        public int getHealth () {
        return health;
        }

        public void setHealth ( int health){
            this.health = health;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String[] getInventory () {
            return inventory;
        }

        public void setInventory (String[]inventory){
            this.inventory = inventory;
        }

        public int getmagLevel () {
            return magLevel;
        }

        public void setmagLevel ( int magLevel){
            this.magLevel = magLevel;
        }

        public int getToonieLevel () {
            return toonieLevel;
        }

        public void setToonieLevel ( int toonieLevel){
            this.toonieLevel = toonieLevel;
        }

    public int getRatTail () {
        return ratTail;
    }

    public void setRatTail ( int ratTail){
        this.ratTail = ratTail;
    }

    public int getSpiderEye() {
        return spiderEye;
    }

    public void setSpiderEye(int spiderEye) {
        this.spiderEye = spiderEye;
    }

    public int getFlyWing() {
        return flyWing;
    }

    public void setFlyWing(int flyWing) {
        this.flyWing = flyWing;
    }



        @Override
        public String toString () {
            return
                    "Atom's Stats:" +
            " | " +
            "Health:" + health +
            " | " +
            "Magic Level:" + magLevel +
            " | " + "\n" +
                            "Toonies: " + toonieLevel +
                            " | " +
                            "Fly Wings: " + flyWing +" | " +
                            "Rat Tails: " + ratTail + " | " +
                            "Spider Eyes: " + spiderEye + " | " + "\n" +
            "Inventory:" + Arrays.toString(inventory) + "\n";


        }
    }


