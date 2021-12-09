import java.util.Random;
import java.util.Scanner;

public class World {
    //Attributes

    World() {

    }

    //Helper Methods
    void roamTheWorld(Hero atom, Enemy fly, Enemy rat, Enemy spider, Enemy dog) {
        boolean battleOn = true;
        Scanner bScan = new Scanner(System.in);
        int userInput;

        while (battleOn) {

            Random a = new Random();
            //20% of the time it is a CRITICAL HIT, 2 * AP
            int enumber = a.nextInt(5) + 1;

            if (enumber <= 2) {
                System.out.println("An fly is approaching!");
                System.out.println("Choose an option (1-3): ");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Run Away");

                userInput = bScan.nextInt();

                switch (userInput) {
                    case 1:
                        atom.attack(fly);
                        if (fly.getHealth() <= 0){
                            System.out.println("You have killed the fly!");
                            System.out.println(" ");
                            break;
                        }
                        System.out.println("The fly now has " + fly.getHealth() + " remaining");
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Heal");
                        break;
                    case 3:
                        System.out.println("Run away");
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

                if (fly.getHealth() > 0){
                    System.out.println("The fly attacks you!");
                    fly.attack(atom);
                    System.out.println(" ");
                    System.out.println("You now have " + atom.getHealth() + " health remaining");
                    System.out.println(" ");
                }


            } else if (enumber > 2 && enumber <= 4) {
                System.out.println("An rat is approaching! ");
                System.out.println("Choose an option (1-3): ");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Run Away");

                userInput = bScan.nextInt();

                switch (userInput) {
                    case 1:
                        atom.attack(rat);
                        if (rat.getHealth() <= 0){
                            System.out.println("You have killed the rat!");
                            System.out.println(" ");
                            break;
                        }
                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                        break;
                    case 2:
                        System.out.println("Heal");
                        break;
                    case 3:
                        System.out.println("Run away");
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

                if (rat.getHealth() > 0) {
                    System.out.println("The rat attacks you!");
                    rat.attack(atom);
                    System.out.println(" ");
                    System.out.println("You now have " + atom.getHealth() + " health remaining");
                    System.out.println(" ");
                }

            } else {
                System.out.println("An spider is approaching");
                System.out.println("Choose an option(1-3): ");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Run Away");

                userInput = bScan.nextInt();

                switch (userInput) {
                    case 1:
                        if (spider.getHealth() <= 0) {
                            System.out.println("You have killed the spider!");
                            System.out.println(" ");
                            break;
                        }
                        System.out.println("The spider now has " + rat.getHealth() + " health remaining");
                        break;
                    case 2:
                        System.out.println("Heal");
                        break;
                    case 3:
                        System.out.println("Run away");
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

                if (spider.getHealth() > 0) {
                    System.out.println("The spider attacks you!");
                    spider.attack(atom);
                    System.out.println(" ");
                    System.out.println("You now have " + atom.getHealth() + " health remaining");
                    System.out.println(" ");
                }

            }
        }
    }
}
