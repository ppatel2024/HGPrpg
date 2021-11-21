import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        //Game objects and characters
        Hero h = new Hero();
        Enemy e1 = new Enemy ();
        World w = new World();
        Scanner scan = new Scanner(System.in);
        boolean gameOn = true;

        System.out.println("Welcome to the HGP RPG");

        //main menu loop
        while (gameOn) {
            System.out.println("Choose an option(1-5):");
            System.out.println("1. Roam the world");
            System.out.println("2. Check hero stats");
            System.out.println("3. Shop");
            System.out.println("4. Final Boss Battle");
            System.out.println("5. Quit Game");

            int userInput = scan.nextInt();

            switch(userInput) {
                case 1:
                    //roam
                    w.roamTheWorld(h, e1);
                    break;
                case 2:
                    //check stats
                    System.out.println(h.toString());
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
