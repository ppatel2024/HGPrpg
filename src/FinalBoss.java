
import java.util.Random;
import java.util.Scanner;

public class FinalBoss {


    FinalBoss() {

    }

    //Helper Methods
    void fighttheBoss (Hero atom, Enemy dog) {
        boolean FinalBattle = true;
        Scanner bScan = new Scanner(System.in);
        int userInput;

        Random h = new Random();
        int healPoint = h.nextInt(5) + 5;

        while (FinalBattle) {
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

                    userInput = bScan.nextInt();

                    switch (userInput) {
                        case 1:
                            atom.attack(dog);
                            if (dog.getHealth() <= 0) {
                                System.out.println("You have killed the dog!");
                                System.out.println(" ");
                                System.out.println("You have earned +1 Magic Power!");
                                System.out.println(" ");

                                int tempML1 = atom.getmagLevel() + 1;
                                atom.setmagLevel(tempML1);
                                break;
                            }
                            System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                            System.out.println(" ");
                            System.out.println("The dog attacks you!");
                            dog.attack(atom);
                            if (atom.getHealth() > 0) {
                                System.out.println("You now have " + atom.getHealth() + " health remaining");
                                System.out.println(" ");
                            } else {
                                FinalBattle = false;
                                break;
                            }

                        case 2:
                            if (atom.getmagLevel() < 3) {
                                System.out.println("You do not have enough Magic Power to complete this move.");
                                break;
                            }
                            atom.magAttack(dog);
                            int tempML2 = atom.getmagLevel() - 3;
                            atom.setmagLevel(tempML2);

                            if (dog.getHealth() <= 0) {
                                System.out.println("You have killed the dog!");
                                System.out.println(" ");
                                System.out.println("You have earned +1 Magic Power!");
                                System.out.println(" ");

                                int tempML3 = atom.getmagLevel() + 1;
                                atom.setmagLevel(tempML3);
                                break;
                            } else {
                                System.out.println("The dog now has " + dog.getHealth() + " health remaining");
                                System.out.println(" ");
                                System.out.println("The dog attacks you!");
                                dog.attack(atom);
                                System.out.println(" ");
                                if (atom.getHealth() > 0) {
                                    System.out.println("You now have " + atom.getHealth() + " health remaining");
                                    System.out.println(" ");
                                } else {
                                    System.out.println("You have died!");
                                    FinalBattle = false;
                                    break;
                                }
                            }
                    }
                            break;
                        case 2:
                            System.out.println("You got " + healPoint + " health!");
                            int moreHealth = atom.getHealth() + healPoint;
                            atom.setHealth(moreHealth);
                            System.out.println(" ");
                            System.out.println("Your health is now: " + atom.getHealth());
                            System.out.println(" ");
                            break;
                        case 3:
                            System.out.println("You have escaped!");
                            System.out.println(" ");
                            FinalBattle = false;
                            break;
                        default:
                            System.out.println("Wrong Input");
                            break;
                    }


            }
        }
    }


