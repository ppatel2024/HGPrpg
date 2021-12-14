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
        String[] ShopInventory = {"Toothpick", "Staple", "Attack Potion", "Healing Potion", "Potion of Invincibility", "Secret *Shhhh*", "Fly Swatter", "Rat Poison", "Spider Web"};
        String[] ShopDisplay = new String[5];
        Random r = new Random();
        int i = 0;

        while (i < 5) {
            int ShopItem = r.nextInt(ShopInventory.length - 1);

            if (Arrays.asList(ShopDisplay).contains(ShopInventory[ShopItem]) == false) {
                ShopDisplay[i] = ShopInventory[ShopItem];
                i++;
            }
        }
            while (shopOn) {

                System.out.println("Hello there, dear! I'm Auntie Ant, and welcome to Auntie Ant's Antiques!");
                System.out.println("What would you like to do today? (Pick and option 1 - 3)");
                System.out.println("1. Buy items");
                System.out.println("2. Sell Items");
                System.out.println("3. Leave");
                userInput = scan.nextInt();

                if (userInput == 1) {

                    System.out.println("1. " + ShopDisplay[0]);
                    System.out.println("2. " + ShopDisplay[1]);
                    System.out.println("3. " + ShopDisplay[2]);
                    System.out.println("4. " + ShopDisplay[3]);
                    System.out.println("5. " + ShopDisplay[4]);
                }
            }
        }
    }

