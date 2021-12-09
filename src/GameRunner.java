import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        //Game objects and characters
        Hero atom = new Hero();
        Enemy fly = new Enemy();
        //Health 5, Attack 5,
        //25% chance of spawn, 10% chance of item drop, 90% chance of dropping coin (1)
        fly.setHealth(5);
        fly.setAttackPower(5);


        Enemy rat = new Enemy();
        //Health 10, Attack 5,
        //25% chance of spawn, 20% chance of item drop, 80% chance of dropping coins (2)
        rat.setHealth(10);
        rat.setAttackPower(5);

        Enemy spider = new Enemy();
        //Health 20, Attack 10,
        //10% chance of spawn, 30% chance of item drop, 70% chance of dropping coins (3)
        spider.setHealth(20);
        spider.setAttackPower(10);

        Enemy dog = new Enemy();
        //FINAL BOSS
        //Health 100, Attack 30
        dog.setHealth(100);
        dog.setAttackPower(30);

        World w = new World();
        Scanner scan = new Scanner(System.in);
        boolean gameOn = true;

        System.out.println("Welcome to the HGP RPG");

        //main menu loop
        while (gameOn) {
            System.out.println("Choose an option (1-5):");
            System.out.println("1. Roam the world");
            System.out.println("2. Check hero stats");
            System.out.println("3. Shop");
            System.out.println("4. Final Boss Battle");
            System.out.println("5. Quit Game");

            int userInput = scan.nextInt();

            switch(userInput) {
                case 1:
                    //roam
                    w.roamTheWorld(atom, fly, rat, spider, dog);
                    break;
                case 2:
                    //check stats
                    System.out.println(atom.toString());
                    break;
                case 3:
                    //shop
                case 4:
                    //final boss
                    break;
                case 5:
                    //end game
                    gameOn = false;
                    System.out.println("Thanks for playing.");
                    break;
                default:
                    System.out.println("INVALID INPUT. Try again.");
                    break;
            }
        }
    }
}
