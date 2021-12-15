import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.TooManyListenersException;

public class World {
    //Attributes

    World() {

    }

    //Helper Methods
    void roamTheWorld(Hero atom, Enemy fly, Enemy rat, Enemy spider, Enemy dog) {
        boolean battleOn = true;
        Scanner bScan = new Scanner(System.in);
        int userInput;
        int healthNumber = 0;
        int AttackPotionNumber = 0;
        int i = 0;
        int arrayRemove = atom.inventory.length;


        while (battleOn) {
            Random a = new Random();
            int enumber = a.nextInt(8) + 1;

            Random h = new Random();
            int healPoint = h.nextInt(5) + 5;

            Random t = new Random();
            int ToonGen = t.nextInt(10) + 1;

            int ItemDrop = t.nextInt(2) + 1;


            if (enumber <= 2) {

                System.out.println("An fly is approaching!");
                System.out.println("Choose an option (1-3): ");
                System.out.println("1. Attack");
                System.out.println("2. Heal");
                System.out.println("3. Run Away");

                userInput = bScan.nextInt();
                switch (userInput) {


                    case 1:
                        System.out.println("What type of attack would you like to use? (Choose an option 1-7)");
                        System.out.println("1. Regular");
                        System.out.println("2. Magic Attack - Requires 3 Magic Power, you have " + atom.getmagLevel());

                        if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                            System.out.println("3. Toothpick");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Staple")) {
                            System.out.println("4. Staple");
                        } else {
                            System.out.println("4. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                            System.out.println("5. Fly Swatter");
                        } else {
                            System.out.println("5. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                            System.out.println("6. Rat Poison");
                        } else {
                            System.out.println("6. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                            System.out.println("7. Spider Web");
                        } else {
                            System.out.println("7. ");
                        }


                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (AttackPotionNumber > 0) {
                                    atom.attack(fly);
                                    atom.attack(fly);
                                    AttackPotionNumber = AttackPotionNumber - 1;
                                } else {
                                    atom.attack(fly);
                                }
                                if (fly.getHealth() <= 0) {
                                    System.out.println("You have killed the fly!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");
                                    int tempML1 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML1);
                                    if (ToonGen <= 9) {
                                        System.out.println("You have earned 1 Toonie!");
                                        System.out.println(" ");
                                        int tempTL1 = atom.getToonieLevel() + 1;
                                        atom.setToonieLevel(tempTL1);
                                    }
                                    if (ItemDrop == 1) {
                                        System.out.println("You found a fly wing!");
                                        System.out.println(" ");
                                        int FW = atom.getFlyWing() + 1;
                                        atom.setFlyWing(FW);
                                    }
                                } else {
                                    System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                    System.out.println(" ");
                                    System.out.println("The fly attacks you!");
                                    fly.attack(atom);
                                    if (atom.getHealth() < 0) {
                                        battleOn = false;
                                    } else {
                                        System.out.println(" ");
                                        System.out.println("You now have " + atom.getHealth() + " health remaining");
                                        System.out.println(" ");
                                    }
                                }
                                break;

                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                } else {
                                    if (AttackPotionNumber > 0) {
                                        atom.magAttack(fly);
                                        atom.magAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.magAttack(fly);
                                    }
                                    int tempML2 = atom.getmagLevel() - 3;
                                    atom.setmagLevel(tempML2);
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML3 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML3);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTl3 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTl3);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");

                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.toothpickAttack(fly);
                                        atom.toothpickAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.toothpickAttack(fly);
                                    }
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 4:
                                if (Arrays.asList(atom.inventory).contains("Staple")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.stapleAttack(fly);
                                        atom.stapleAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.attack(fly);
                                    }
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 5:
                                if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.flySwatterAttack(fly);
                                        atom.flySwatterAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.flySwatterAttack(fly);
                                    }
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;

                            case 6:
                                if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.ratPoisonAttack(fly);
                                        atom.ratPoisonAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.ratPoisonAttack(fly);
                                    }
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;

                            case 7:
                                if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.spiderWebAttack(fly);
                                        atom.spiderWebAttack(fly);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.spiderWebAttack(fly);
                                    }
                                    if (fly.getHealth() <= 0) {
                                        System.out.println("You have killed the fly!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a fly wing!");
                                            System.out.println(" ");
                                            int FW = atom.getFlyWing() + 1;
                                            atom.setFlyWing(FW);
                                        }
                                    } else {
                                        System.out.println("The fly now has " + fly.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The fly attacks you!");
                                        fly.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                        } else {
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                }
                                break;
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("How would you like to heal yourself? (Choose an option 1-4) ");
                        System.out.println("1. Regular");

                        if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                            System.out.println("2. Attack Potion");
                        } else {
                            System.out.println("2. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                            System.out.println("3. Healing Potion");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                            System.out.println("4. Potion of MEGA Health");
                        } else {
                            System.out.println("4. ");
                        }

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (healthNumber <= 3) {
                                    System.out.println("You got " + healPoint + " health!");
                                    int moreHealth = atom.getHealth() + healPoint;
                                    atom.setHealth(moreHealth);
                                    System.out.println(" ");
                                    System.out.println("Your health is now: " + atom.getHealth());
                                    System.out.println(" ");
                                    healthNumber++;
                                } else {
                                    System.out.println("You have run out of free health. Try again later!");
                                }
                                break;
                            case 2:
                                if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                                    AttackPotionNumber++;
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Attack Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                                    int tempHP = atom.getHealth() + 30;
                                    atom.setHealth(tempHP);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Healing Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 4:
                                if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                                    int tempMH = atom.getHealth() + 500;
                                    atom.setHealth(tempMH);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Potion of MEGA Health") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("You have escaped!");
                        System.out.println(" ");
                        battleOn = false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;

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

                        if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                            System.out.println("3. Toothpick");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Staple")) {
                            System.out.println("4. Staple");
                        } else {
                            System.out.println("4. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                            System.out.println("5. Fly Swatter");
                        } else {
                            System.out.println("5. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                            System.out.println("6. Rat Poison");
                        } else {
                            System.out.println("6. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                            System.out.println("7. Spider Web");
                        } else {
                            System.out.println("7. ");
                        }

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (AttackPotionNumber > 0) {
                                    atom.attack(rat);
                                    atom.attack(rat);
                                    AttackPotionNumber = AttackPotionNumber - 1;
                                } else {
                                    atom.attack(rat);
                                }
                                if (rat.getHealth() <= 0) {
                                    System.out.println("You have killed the rat!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");
                                    int tempML = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML);
                                    if (ToonGen <= 8) {
                                        System.out.println("You have earned 2 Toonies!");
                                        System.out.println(" ");
                                        int tempTL = atom.getToonieLevel() + 2;
                                        atom.setToonieLevel(tempTL);
                                    } else {
                                        System.out.println("You have earned 1 Toonie!");
                                        System.out.println(" ");
                                        int tempTL = atom.getToonieLevel() + 1;
                                        atom.setToonieLevel(tempTL);
                                    }
                                    if (ItemDrop == 1) {
                                        System.out.println("You found a rat tail!");
                                        System.out.println(" ");
                                        int RT = atom.getRatTail() + 1;
                                        atom.setRatTail(RT);
                                    }
                                } else {
                                    System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                    System.out.println(" ");
                                    System.out.println("The rat attacks you!");
                                    rat.attack(atom);
                                    if (atom.getHealth() < 0) {
                                        battleOn = false;
                                        System.out.println(" ");
                                        System.out.println("You now have " + atom.getHealth() + " health remaining");
                                        System.out.println(" ");
                                    }
                                }
                                break;
                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                } else {
                                    if (AttackPotionNumber > 0) {
                                        atom.magAttack(rat);
                                        atom.magAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.magAttack(rat);
                                    }
                                    int tempML1 = atom.getmagLevel() - 3;
                                    atom.setmagLevel(tempML1);
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML2 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML2);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL2 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL2);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL2 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL2);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);
                                        }
                                    } else {
                                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The rat attacks you!");
                                        rat.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.toothpickAttack(rat);
                                        atom.toothpickAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.toothpickAttack(rat);
                                    }
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL);
                                            break;
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);
                                        }
                                    } else {
                                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The rat attacks you!");
                                        rat.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 4:
                                if (Arrays.asList(atom.inventory).contains("Staple")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.stapleAttack(rat);
                                        atom.stapleAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.stapleAttack(rat);
                                    }
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);
                                        }
                                    } else {
                                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The rat attacks you!");
                                        rat.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");

                                }
                                break;
                            case 5:
                                if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.flySwatterAttack(rat);
                                        atom.flySwatterAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.flySwatterAttack(rat);
                                    }
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);
                                        }
                                    } else {
                                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The rat attacks you!");
                                        rat.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 6:
                                if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.ratPoisonAttack(rat);
                                        atom.ratPoisonAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.ratPoisonAttack(rat);
                                    }
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);
                                        }
                                    } else {
                                        System.out.println("The rat now has " + rat.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The rat attacks you!");
                                        rat.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 7:
                                if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.spiderWebAttack(rat);
                                        atom.spiderWebAttack(rat);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.spiderWebAttack(rat);
                                    }
                                    if (rat.getHealth() <= 0) {
                                        System.out.println("You have killed the rat!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML);
                                        if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a rat tail!");
                                            System.out.println(" ");
                                            int RT = atom.getRatTail() + 1;
                                            atom.setRatTail(RT);

                                        }
                                    }
                                }
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("How would you like to heal yourself? (Choose an option 1-4) ");
                        System.out.println("1. Regular");

                        if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                            System.out.println("2. Attack Potion");
                        } else {
                            System.out.println("2. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                            System.out.println("3. Healing Potion");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                            System.out.println("4. Potion of MEGA Health");
                        } else {
                            System.out.println("4. ");
                        }

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (healthNumber <= 3) {
                                    System.out.println("You got " + healPoint + " health!");
                                    int moreHealth = atom.getHealth() + healPoint;
                                    atom.setHealth(moreHealth);
                                    System.out.println(" ");
                                    System.out.println("Your health is now: " + atom.getHealth());
                                    System.out.println(" ");
                                    healthNumber++;
                                } else {
                                    System.out.println("You have run out of free health. Try again later!");
                                }
                                break;
                            case 2:
                                if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                                    AttackPotionNumber++;
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Attack Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                                    int tempHP = atom.getHealth() + 30;
                                    atom.setHealth(tempHP);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Healing Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 4:
                                if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                                    int tempMH = atom.getHealth() + 500;
                                    atom.setHealth(tempMH);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Potion of MEGA Health") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("You have escaped!");
                        System.out.println(" ");
                        battleOn = false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }

            } else if (enumber >= 4 && enumber <= 5) {
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
                        if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                            System.out.println("3. Toothpick");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Staple")) {
                            System.out.println("4. Staple");
                        } else {
                            System.out.println("4. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                            System.out.println("5. Fly Swatter");
                        } else {
                            System.out.println("5. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                            System.out.println("6. Rat Poison");
                        } else {
                            System.out.println("6. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                            System.out.println("7. Spider Web");
                        } else {
                            System.out.println("7. ");
                        }

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (AttackPotionNumber > 0) {
                                    atom.attack(spider);
                                    atom.attack(spider);
                                    AttackPotionNumber = AttackPotionNumber - 1;
                                } else {
                                    atom.attack(spider);
                                }
                                if (spider.getHealth() <= 0) {
                                    System.out.println("You have killed the spider!");
                                    System.out.println(" ");
                                    System.out.println("You have earned +1 Magic Power!");
                                    System.out.println(" ");
                                    int tempML1 = atom.getmagLevel() + 1;
                                    atom.setmagLevel(tempML1);
                                    if (ToonGen <= 7) {
                                        System.out.println("You have earned 3 Toonies!");
                                        System.out.println(" ");
                                        int tempTL1 = atom.getToonieLevel() + 3;
                                        atom.setToonieLevel(tempTL1);
                                    } else if (ToonGen <= 8) {
                                        System.out.println("You have earned 2 Toonies!");
                                        System.out.println(" ");
                                        int tempTL1 = atom.getToonieLevel() + 2;
                                        atom.setToonieLevel(tempTL1);
                                        break;
                                    } else {
                                        System.out.println("You have earned 1 Toonie!");
                                        System.out.println(" ");
                                        int tempTL1 = atom.getToonieLevel() + 1;
                                        atom.setToonieLevel(tempTL1);
                                    }
                                    if (ItemDrop == 1) {
                                        System.out.println("You found a spider eye!");
                                        System.out.println(" ");
                                        int SE = atom.getSpiderEye() + 1;
                                        atom.setSpiderEye(SE);
                                    }
                                } else {
                                    System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                    System.out.println(" ");
                                    System.out.println("The spider attacks you!");
                                    spider.attack(atom);
                                    if (atom.getHealth() < 0) {
                                        battleOn = false;
                                        System.out.println(" ");
                                        System.out.println("You now have " + atom.getHealth() + " health remaining");
                                        System.out.println(" ");
                                    }
                                }
                                break;

                            case 2:
                                if (atom.getmagLevel() < 3) {
                                    System.out.println("You do not have enough Magic Power to complete this move.");
                                    break;
                                } else {
                                    if (AttackPotionNumber > 0) {
                                        atom.magAttack(spider);
                                        atom.magAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.magAttack(spider);
                                    }
                                    int tempML2 = atom.getmagLevel() - 3;
                                    atom.setmagLevel(tempML2);
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML4 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML4);
                                        if (ToonGen <= 9) {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL4 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL4);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);
                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Toothpick")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.toothpickAttack(spider);
                                        atom.toothpickAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.toothpickAttack(spider);
                                    }
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 7) {
                                            System.out.println("You have earned 3 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 3;
                                            atom.setToonieLevel(tempTL1);
                                        } else if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL1);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);

                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;

                            case 4:

                                if (Arrays.asList(atom.inventory).contains("Staple")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.stapleAttack(spider);
                                        atom.stapleAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.stapleAttack(spider);
                                    }
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 7) {
                                            System.out.println("You have earned 3 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 3;
                                            atom.setToonieLevel(tempTL1);
                                        } else if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL1);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);
                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }

                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }

                                break;

                            case 5:
                                if (Arrays.asList(atom.inventory).contains("Fly Swatter")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.flySwatterAttack(spider);
                                        atom.flySwatterAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.flySwatterAttack(spider);
                                    }
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 7) {
                                            System.out.println("You have earned 3 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 3;
                                            atom.setToonieLevel(tempTL1);
                                        } else if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL1);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);
                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;

                            case 6:
                                if (Arrays.asList(atom.inventory).contains("Rat Poison")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.ratPoisonAttack(spider);
                                        atom.ratPoisonAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.ratPoisonAttack(spider);
                                    }
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 7) {
                                            System.out.println("You have earned 3 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 3;
                                            atom.setToonieLevel(tempTL1);
                                        } else if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL1);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);
                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 7:
                                if (Arrays.asList(atom.inventory).contains("Spider Web")) {
                                    if (AttackPotionNumber > 0) {
                                        atom.spiderWebAttack(spider);
                                        atom.spiderWebAttack(spider);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.spiderWebAttack(spider);
                                    }
                                    if (spider.getHealth() <= 0) {
                                        System.out.println("You have killed the spider!");
                                        System.out.println(" ");
                                        System.out.println("You have earned +1 Magic Power!");
                                        System.out.println(" ");
                                        int tempML1 = atom.getmagLevel() + 1;
                                        atom.setmagLevel(tempML1);
                                        if (ToonGen <= 7) {
                                            System.out.println("You have earned 3 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 3;
                                            atom.setToonieLevel(tempTL1);
                                        } else if (ToonGen <= 8) {
                                            System.out.println("You have earned 2 Toonies!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 2;
                                            atom.setToonieLevel(tempTL1);
                                        } else {
                                            System.out.println("You have earned 1 Toonie!");
                                            System.out.println(" ");
                                            int tempTL1 = atom.getToonieLevel() + 1;
                                            atom.setToonieLevel(tempTL1);
                                        }
                                        if (ItemDrop == 1) {
                                            System.out.println("You found a spider eye!");
                                            System.out.println(" ");
                                            int SE = atom.getSpiderEye() + 1;
                                            atom.setSpiderEye(SE);
                                        }
                                    } else {
                                        System.out.println("The spider now has " + spider.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The spider attacks you!");
                                        spider.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            battleOn = false;
                                            System.out.println(" ");
                                            System.out.println("You now have " + atom.getHealth() + " health remaining");
                                            System.out.println(" ");
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;

                    case 2:
                        System.out.println("How would you like to heal yourself? (Choose an option 1-4) ");
                        System.out.println("1. Regular");

                        if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                            System.out.println("2. Attack Potion");
                        } else {
                            System.out.println("2. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                            System.out.println("3. Healing Potion");
                        } else {
                            System.out.println("3. ");
                        }
                        if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                            System.out.println("4. Potion of MEGA Health");
                        } else {
                            System.out.println("4. ");
                        }

                        userInput = bScan.nextInt();

                        switch (userInput) {
                            case 1:
                                if (healthNumber <= 3) {
                                    System.out.println("You got " + healPoint + " health!");
                                    int moreHealth = atom.getHealth() + healPoint;
                                    atom.setHealth(moreHealth);
                                    System.out.println(" ");
                                    System.out.println("Your health is now: " + atom.getHealth());
                                    System.out.println(" ");
                                    healthNumber++;
                                } else {
                                    System.out.println("You have run out of free health. Try again later!");
                                }
                                break;
                            case 2:
                                if (Arrays.asList(atom.inventory).contains("Attack Potion")) {
                                    AttackPotionNumber++;
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Attack Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 3:
                                if (Arrays.asList(atom.inventory).contains("Healing Potion")) {
                                    int tempHP = atom.getHealth() + 30;
                                    atom.setHealth(tempHP);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Healing Potion") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            case 4:
                                if (Arrays.asList(atom.inventory).contains("Potion of MEGA Health")) {
                                    int tempMH = atom.getHealth() + 500;
                                    atom.setHealth(tempMH);
                                    while (i < arrayRemove) {
                                        if (atom.inventory[i] == "Potion of MEGA Health") {
                                            atom.inventory[i] = null;
                                            i = 0;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    System.out.println("Incorrect input, try again.");
                                }
                                break;
                            default:
                                System.out.println("Incorrect input, try again.");
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("You have escaped!");
                        System.out.println(" ");
                        battleOn = false;
                        break;
                    default:
                        System.out.println("Wrong Input");
                        break;
                }
                break;
            } else if (enumber == 6) {
                System.out.println("You find a cake crumb on the floor, leftover from your little brother's birthday party!");
                System.out.println("You eat it and get +30 health!");
                int tempHealth = atom.getHealth() + 30;
                atom.setHealth(tempHealth);
            } else if (enumber == 7) {
                System.out.println("You come across a troublesome dust mite.");
                System.out.println("He lunges at you and takes your" + atom.inventory[0] + "from you!");
                System.out.println("He runs off beneath a table, and when you chase after him, you realize he's gone.");
                atom.inventory[0] = null;
            } else {
                System.out.println("You come across a small beehive that is filled with worker bees frantically running around.");
                System.out.println("You learn that their queen has gone missing, and you go and help look for her");
                System.out.println("After some time, you find her stuck in a sticky trap.");
                System.out.println("You help her get out, and as a reward for your generosity, she blesses you and wishes you luck on your journey.");
                System.out.println("You have leveled up and have earned 20 health!");
                int tempLevel = atom.getHeroLevel() + 1;
                atom.setHeroLevel(tempLevel);
                int tempHealth = atom.getHealth() + 20;
                atom.setHealth(tempHealth);

            }
        }
    }
}

