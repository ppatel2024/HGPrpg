
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FinalBoss {


    FinalBoss() {

    }

    //Helper Methods
    void fighttheBoss(Hero atom, Enemy dog) {
        boolean FinalBattle = true;
        Scanner bScan = new Scanner(System.in);
        int userInput;
        int healthNumber = 0;
        int AttackPotionNumber = 0;
        int i = 0;
        int arrayRemove = atom.inventory.length;

        Random h = new Random();
        int healPoint = h.nextInt(5) + 5;

        while (FinalBattle) {
            if (atom.getHeroLevel() < 3) {
                System.out.println("Come back when you reach a higher level!");
                break;
            } else {
                System.out.println("Your dog is approaching!");
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
                                    atom.attack(dog);
                                    atom.attack(dog);
                                    AttackPotionNumber = AttackPotionNumber - 1;
                                } else {
                                    atom.attack(dog);
                                }
                                if (dog.getHealth() <= 0) {
                                    System.out.println("You knock the dog out, allowing you get through!");
                                    System.out.println("All of a sudden the floor around you starts to shake.");
                                    System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                    System.out.println("You land on your bed with a thump.");
                                    System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                    System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                } else {
                                    System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                    System.out.println(" ");
                                    System.out.println("The spider attacks you!");
                                    dog.attack(atom);
                                    if (atom.getHealth() < 0) {
                                        FinalBattle = false;
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
                                        atom.magAttack(dog);
                                        atom.magAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.magAttack(dog);
                                    }
                                    int tempML2 = atom.getmagLevel() - 3;
                                    atom.setmagLevel(tempML2);
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                                        atom.toothpickAttack(dog);
                                        atom.toothpickAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.toothpickAttack(dog);
                                    }
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                                        atom.stapleAttack(dog);
                                        atom.stapleAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.stapleAttack(dog);
                                    }
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                                        atom.flySwatterAttack(dog);
                                        atom.flySwatterAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.flySwatterAttack(dog);
                                    }
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                                        atom.ratPoisonAttack(dog);
                                        atom.ratPoisonAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.ratPoisonAttack(dog);
                                    }
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                                        atom.spiderWebAttack(dog);
                                        atom.spiderWebAttack(dog);
                                        AttackPotionNumber = AttackPotionNumber - 1;
                                    } else {
                                        atom.spiderWebAttack(dog);
                                    }
                                    if (dog.getHealth() <= 0) {
                                        System.out.println("You knock the dog out, allowing you get through!");
                                        System.out.println("All of a sudden the floor around you starts to shake.");
                                        System.out.println("A huge crack opens up and swallows you whole, causing you to fall into emptiness.");
                                        System.out.println("You land on your bed with a thump.");
                                        System.out.println("Now normal-sized, you realize that it was all just a stress-induced nightmare");
                                        System.out.println("You get ready and leave the house, bracing yourself for the real test yet to come.");
                                    } else {
                                        System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                        System.out.println(" ");
                                        System.out.println("The dog attacks you!");
                                        dog.attack(atom);
                                        if (atom.getHealth() < 0) {
                                            FinalBattle = false;
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
                            case 3:
                                System.out.println("You have escaped!");
                                System.out.println(" ");
                                FinalBattle = false;
                                break;
                            default:
                                System.out.println("Wrong Input");
                                break;

                }

                break;
            }
        }
    }
}



