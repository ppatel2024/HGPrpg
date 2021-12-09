import java.util.Arrays;

public class Hero {
    //Attributes
    private int health;
    private int magLevel;
    private String name;
    private String[] inventory = new String[5];

    //Constructor
    Hero() {
        this.health = 100;
        this.name = "Hero";
        this.inventory[0] = "Potion";
        this.magLevel = 0;
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

        @Override
        public String toString () {
            return "Hero{" +
                    "health=" + health +
                    "Magic Level=" + magLevel +
                    ", name='" + name + '\'' +
                    ", inventory=" + Arrays.toString(inventory) +
                    '}';
        }
    }


