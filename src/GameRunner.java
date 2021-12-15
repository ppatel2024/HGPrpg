import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        //Game objects and characters
        Hero atom = new Hero();
        Enemy fly = new Enemy();
        fly.setHealth(5);
        fly.setAttackPower(5);
        //Health 5, Attack 5,
        //25% chance of spawn, 10% chance of item drop, 90% chance of dropping coin (1)
        Enemy rat = new Enemy();
        rat.setHealth(10);
        rat.setAttackPower(5);
        //Health 10, Attack 5,
        //25% chance of spawn, 20% chance of item drop, 80% chance of dropping coins (2)
        Enemy spider = new Enemy();
        spider.setHealth(20);
        spider.setAttackPower(10);
        //Health 20, Attack 10,
        //10% chance of spawn, 30% chance of item drop, 70% chance of dropping coins (3)
        Enemy dog = new Enemy();
        dog.setHealth(100);
        dog.setAttackPower(30);
        //FINAL BOSS
        //Health 100, Attack 30
        World w = new World();
        Shop s = new Shop();
        FinalBoss f = new FinalBoss();
        Scanner scan = new Scanner(System.in);
        boolean alive = true;
        boolean gameOn = true;

        //Game intro

        System.out.println("Welcome to the Tale of the Oversized Atom!");
        System.out.println(" ");
        System.out.println("You awake from a day of stressing over midterms and a negative lunch balance.");
        System.out.println("All of the sudden your blanket stretches so far it looks like a sea of cotton.");
        System.out.println("You hear your mother call your name from the kitchen 'Atom!' ");
        System.out.println("You crawl out of your bed after sprinting off, nearly breaking your bones and you enter a world of evil");

        //Main menu loop
        while (gameOn) {
            while (alive) {

                if (atom.getHealth() <= 0) {
                    alive = false;
                } else {
                    System.out.println("Choose an option(1-5):");
                    System.out.println("1. Roam the world");
                    System.out.println("2. Check hero stats");
                    System.out.println("3. Shop");
                    System.out.println("4. Final Boss Battle");
                    System.out.println("5. Quit Game");

                    int userInput = scan.nextInt();

                    switch (userInput) {
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
                            s.visitTheShop(atom);
                            break;
                        case 4:
                            //final boss
                            f.fighttheBoss(atom, dog);
                            break;
                        case 5:
                            //end game
                            alive = false;
                            System.out.println("Thanks for playing!");
                            break;
                        default:
                            System.out.println("INVALID INPUT. Try again.");
                            break;
                    }
                }
            }
            //Death menu
            System.out.println("Game over! Would you like to play again? (1 - yes, 2 - no)");

            int userInput1 = scan.nextInt();

            if (userInput1 == 1) {
                atom.setHealth(100);
                alive = true;
            } else if (userInput1 == 2) {
                System.out.println("Thanks for playing!");
            } else {
                System.out.println("Invalid Input");
            }

        }
    }
}
