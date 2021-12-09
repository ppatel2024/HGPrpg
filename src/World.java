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
                        System.out.println("What type of attack would you like to use?");
                        System.out.println("1. Regular");
                        System.out.println("2. Magic Attack - Requires 3 Magic Power, you have " + atom.getmagLevel());

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                atom.attack(fly);
                                if (fly.getHealth() <= 0) {
                                    System.out.println("You have killed the fly!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML1 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML1);
                                    break;
                                }

                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                    break;
                                }
                                atom.magAttack(fly);
                                int tempML2 = atom.getmagLevel() - 3;
                                atom.setmagLevel(tempML2);

                                if (fly.getHealth() <= 0) {
                                    System.out.println("You have killed the fly!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML3 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML3);
                                    break;
                                }
                                System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                break;
                        }
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

                        if (fly.getHealth() > 0) {
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
                        System.out.println("What type of attack would you like to use?");
                        System.out.println("1. Regular");
                        System.out.println("2. Magic Attack - Requires 3 Magic Power, you have " + atom.getmagLevel());

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                atom.attack(rat);
                                if (rat.getHealth() <= 0) {
                                    System.out.println("You have killed the rat!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML);
                                    break;
                                }

                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                    break;
                                }
                                atom.magAttack(rat);
                                int tempML1 = atom.getmagLevel() - 3;
                                atom.setmagLevel(tempML1);

                                if (rat.getHealth() <= 0) {
                                    System.out.println("You have killed the rat!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML2 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML2);
                                    break;
                                }
                                System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                break;
                        }
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
                        System.out.println("What type of attack would you like to use?");
                        System.out.println("1. Regular");
                        System.out.println("2. Magic Attack - Requires 3 Magic Power, you have " + atom.getmagLevel());

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                atom.attack(spider);
                                if (spider.getHealth() <= 0) {
                                    System.out.println("You have killed the spider!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML1 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML1);
                                    break;
                                }

                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                    break;
                                }
                                atom.magAttack(spider);
                                int tempML2 = atom.getmagLevel() - 3;
                                atom.setmagLevel(tempML2);

                                if (spider.getHealth() <= 0) {
                                    System.out.println("You have killed the spider!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");

                                    int tempML4 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML4);
                                    break;
                                }
                                System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                break;
                        }
                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
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
