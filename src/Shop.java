import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shop {

    Shop() {

    }

    void visitTheShop(Hero atom) {
        boolean shopOn = true;
        Scanner scan = new Scanner(System.in);
        int userInput;
        String[] ShopInventory = {"Toothpick - Deals 10 damage (15 critical) - 10 TOONIES", "Staple - Deals 15 damage (20 critical) - 15 TOONIES", "Attack Potion - 2x damage for 1 turn - 5 TOONIES", "Healing Potion - Gives you 30 health - 3 TOONIES", "Potion of MEGA Health - Gives you 500 Health - 50 TOONIES", "Secret *Shhhh* - 25 TOONIES", "Fly Swatter - Deals 30 damage (45 critical) - 5 FLY WINGS", "Rat Poison - Deals 40 damage (60 critical) - 5 RAT TAILS", "Spider Web - Deals 50 damage (75 critical) - 5 SPIDER EYES"};
        String[] ShopDisplay = new String[5];
        Random r = new Random();
        int i = 0;

        while (i < 3) {
            int ShopItem = r.nextInt(ShopInventory.length - 1);

            if (Arrays.asList(ShopDisplay).contains(ShopInventory[ShopItem]) == false) {
                ShopDisplay[i] = ShopInventory[ShopItem];
                i++;
            }
        }
            while (shopOn) {

                System.out.println("Hello there, dear! I'm Auntie Ant, and welcome to Auntie Ant's Antiques!");
                System.out.println("What would you like to do today? (Pick an option 1 - 3)");
                System.out.println("1. Buy items");
                System.out.println("2. Sell Items");
                System.out.println("3. Leave");
                userInput = scan.nextInt();

                if (userInput == 1) {

                    System.out.println("Today's Items Up for Sale!");
                    System.out.println(" ");
                    System.out.println("You have " + atom.getToonieLevel() + " Toonies!");
                    System.out.println(" ");
                    System.out.println("What would you like? (Pick an option 1 - 3)");
                    System.out.println(" ");
                    System.out.println("1. " + ShopDisplay[0]);
                    System.out.println("2. " + ShopDisplay[1]);
                    System.out.println("3. " + ShopDisplay[2]);
                    userInput = scan.nextInt();

                    if (userInput) == 1 {
                        if (ShopDisplay[0] == "Toothpick - Deals 10 damage (15 critical) - 10 TOONIES") {
                            if (atom.getToonieLevel() < 10) {
                                System.out.println("You do not have enough Toonies to buy this.");
                            } else {
                                System.out.println("You have bought a Toothpick!");
                                int tempTL = atom.getToonieLevel() - 10;
                                atom.setToonieLevel(tempTL);
                                    I WILL CHANGE THIS





                }
            }
        }
    }

