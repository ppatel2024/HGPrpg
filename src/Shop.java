import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Shop {

    Shop() {

    }

    void visitTheShop(Hero atom) {
        boolean shopOn = true;
        boolean keepShopping = false;
        Scanner scan = new Scanner(System.in);
        int userInput;
        String[] ShopInventory = {"Toothpick - Deals 10 damage - 10 TOONIES",
                "Staple - Deals 15 damage - 15 TOONIES",
                "Attack Potion - 2x damage for 1 turn - 5 TOONIES",
                "Healing Potion - Gives you 30 health - 3 TOONIES",
                "Potion of MEGA Health - Gives you 500 Health - 50 TOONIES",
                "Secret *Shhhh* - 25 TOONIES",
                "Fly Swatter - Deals 30 damage - 5 FLY WINGS",
                "Rat Poison - Deals 40 damage - 5 RAT TAILS",
                "Spider Web - Deals 50 damage - 5 SPIDER EYES"};
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
            System.out.println("What would you like to do today? (Pick an option 1 or 2)");
            System.out.println("1. Buy items");
            System.out.println("2. Leave");
            userInput = scan.nextInt();

            if (userInput == 1) {

                keepShopping = true;
                while (keepShopping) {

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

                    //Shop Display 0
                    switch (userInput) {
                        case 1:
                            if (ShopDisplay[0] == "Toothpick - Deals 10 damage - 10 TOONIES") {
                                if (atom.getToonieLevel() < 10) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        shopOn = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Toothpick!");
                                    int tempTL = atom.getToonieLevel() - 10;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Toothpick");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Staple - Deals 15 damage - 15 TOONIES") {
                                if (atom.getToonieLevel() < 15) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        shopOn = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Staple!");
                                    int tempTL = atom.getToonieLevel() - 15;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Staple");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Attack Potion - 2x damage for 1 turn - 5 TOONIES") {
                                if (atom.getToonieLevel() < 5) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought an Attack Potion!");
                                    int tempTL = atom.getToonieLevel() - 5;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Attack Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Healing Potion - Gives you 30 health - 3 TOONIES") {
                                if (atom.getToonieLevel() < 3) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Healing Potion!");
                                    int tempTL = atom.getToonieLevel() - 3;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Healing Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Potion of MEGA Health - Gives you 500 Health - 50 TOONIES") {
                                if (atom.getToonieLevel() < 50) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a MEGA Health potion!");
                                    int tempTL = atom.getToonieLevel() - 50;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Potion of MEGA Health");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Secret *Shhhh* - 25 TOONIES") {
                                if (atom.getToonieLevel() < 25) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Secret *Shhhh*!");
                                    int tempTL = atom.getToonieLevel() - 25;
                                    atom.setToonieLevel(tempTL);
                                    System.out.println("I'm not really sure what this is dear, but I think it could be of use to you.");
                                    System.out.println("*She gives you an old Post-It note*.");
                                    System.out.println("On it is written: 'When I grow up, I want to own 7 dogs!' ");

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Fly Swatter - Deals 30 damage - 5 FLY WINGS") {
                                if (atom.getFlyWing() < 5) {
                                    System.out.println("You do not have enough Fly Wings to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Fly Swatter!");
                                    int tempTL = atom.getFlyWing() - 5;
                                    atom.setFlyWing(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Fly Swatter");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Rat Poison - Deals 40 damage - 5 RAT TAILS") {
                                if (atom.getRatTail() < 5) {
                                    System.out.println("You do not have enough Rat Tails to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought Rat Poison!");
                                    int tempTL = atom.getRatTail() - 5;
                                    atom.setRatTail(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Rat Poison");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[0] == "Spider Web - Deals 50 damage - 5 SPIDER EYES") {
                                if (atom.getSpiderEye() < 5) {
                                    System.out.println("You do not have enough Spider Eyes to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Spider Web!");
                                    int tempTL = atom.getSpiderEye() - 5;
                                    atom.setSpiderEye(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Spider Web");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }

                                System.out.println(" ");
                                System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                userInput = scan.nextInt();
                                if (userInput == 1) {
                                    break;
                                } else {
                                    System.out.println("Thank you, come again soon dear!");
                                    keepShopping = false;
                                    break;
                                }
                            }
                        case 2:
                            if (ShopDisplay[1] == "Toothpick - Deals 10 damage - 10 TOONIES") {
                                if (atom.getToonieLevel() < 10) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Toothpick!");
                                    int tempTL = atom.getToonieLevel() - 10;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Toothpick");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Staple - Deals 15 damage - 15 TOONIES") {
                                if (atom.getToonieLevel() < 15) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Staple!");
                                    int tempTL = atom.getToonieLevel() - 15;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Staple");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Attack Potion - 2x damage for 1 turn - 5 TOONIES") {
                                if (atom.getToonieLevel() < 5) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought an Attack Potion!");
                                    int tempTL = atom.getToonieLevel() - 5;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Attack Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Healing Potion - Gives you 30 health - 3 TOONIES") {
                                if (atom.getToonieLevel() < 3) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Healing Potion!");
                                    int tempTL = atom.getToonieLevel() - 3;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Healing Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Potion of MEGA Health - Gives you 500 Health - 50 TOONIES") {
                                if (atom.getToonieLevel() < 50) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a MEGA Health potion!");
                                    int tempTL = atom.getToonieLevel() - 50;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Potion of MEGA Health");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Secret *Shhhh* - 25 TOONIES") {
                                if (atom.getToonieLevel() < 25) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Secret *Shhhh*!");
                                    int tempTL = atom.getToonieLevel() - 25;
                                    atom.setToonieLevel(tempTL);
                                    System.out.println("I'm not really sure what this is dear, but I think it could be of use to you.");
                                    System.out.println("*She gives you an old Post-It note*.");
                                    System.out.println("On it is written: 'When I grow up, I want to own 7 dogs!' ");

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[1] == "Fly Swatter - Deals 30 damage - 5 FLY WINGS") {
                                if (atom.getFlyWing() < 5) {
                                    System.out.println("You do not have enough Fly Wings to buy this.");
                                } else {
                                    System.out.println("You have bought a Fly Swatter!");
                                    int tempTL = atom.getFlyWing() - 5;
                                    atom.setFlyWing(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Fly Swatter");
                                            System.out.println(Arrays.toString(atom.inventory));
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[1] == "Rat Poison - Deals 40 damage - 5 RAT TAILS") {
                                if (atom.getRatTail() < 5) {
                                    System.out.println("You do not have enough Rat Tails to buy this.");
                                } else {
                                    System.out.println("You have bought Rat Poison!");
                                    int tempTL = atom.getRatTail() - 5;
                                    atom.setRatTail(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Rat Poison");
                                            System.out.println(Arrays.toString(atom.inventory));
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[1] == "Spider Web - Deals 50 damage - 5 SPIDER EYES") {
                                if (atom.getSpiderEye() < 5) {
                                    System.out.println("You do not have enough Spider Eyes to buy this.");
                                } else {
                                    System.out.println("You have bought a Spider Web!");
                                    int tempTL = atom.getSpiderEye() - 5;
                                    atom.setSpiderEye(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Spider Web");
                                            System.out.println(Arrays.toString(atom.inventory));
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            }
                        case 3:
                            if (ShopDisplay[2] == "Toothpick - Deals 10 damage - 10 TOONIES") {
                                if (atom.getToonieLevel() < 10) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Toothpick!");
                                    int tempTL = atom.getToonieLevel() - 10;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Toothpick");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[2] == "Staple - Deals 15 damage - 15 TOONIES") {
                                if (atom.getToonieLevel() < 15) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Staple!");
                                    int tempTL = atom.getToonieLevel() - 15;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Staple");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Attack Potion - 2x damage for 1 turn - 5 TOONIES") {
                                if (atom.getToonieLevel() < 5) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought an Attack Potion!");
                                    int tempTL = atom.getToonieLevel() - 5;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Attack Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Healing Potion - Gives you 30 health - 3 TOONIES") {
                                if (atom.getToonieLevel() < 3) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Healing Potion!");
                                    int tempTL = atom.getToonieLevel() - 3;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Healing Potion");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Potion of MEGA Health - Gives you 500 Health - 50 TOONIES") {
                                if (atom.getToonieLevel() < 50) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a MEGA Health potion!");
                                    int tempTL = atom.getToonieLevel() - 50;
                                    atom.setToonieLevel(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Potion of MEGA Health");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Secret *Shhhh* - 25 TOONIES") {
                                if (atom.getToonieLevel() < 25) {
                                    System.out.println("You do not have enough Toonies to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Secret *Shhhh*!");
                                    int tempTL = atom.getToonieLevel() - 25;
                                    atom.setToonieLevel(tempTL);
                                    System.out.println("I'm not really sure what this is dear, but I think it could be of use to you.");
                                    System.out.println("*She gives you an old Post-It note*.");
                                    System.out.println("On it is written: 'When I grow up, I want to own 7 dogs!' ");

                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            } else if (ShopDisplay[2] == "Fly Swatter - Deals 30 damage - 5 FLY WINGS") {
                                if (atom.getFlyWing() < 5) {
                                    System.out.println("You do not have enough Fly Wings to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Fly Swatter!");
                                    int tempTL = atom.getFlyWing() - 5;
                                    atom.setFlyWing(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Fly Swatter");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Rat Poison - Deals 40 damage - 5 RAT TAILS") {
                                if (atom.getRatTail() < 5) {
                                    System.out.println("You do not have enough Rat Tails to buy this.");
                                } else {
                                    System.out.println("You have bought Rat Poison!");
                                    int tempTL = atom.getRatTail() - 5;
                                    atom.setRatTail(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Rat Poison");
                                            System.out.println(Arrays.toString(atom.inventory));
                                        } else {
                                            i++;
                                        }
                                    }
                                }
                            } else if (ShopDisplay[2] == "Spider Web - Deals 50 damage - 5 SPIDER EYES") {
                                if (atom.getSpiderEye() < 5) {
                                    System.out.println("You do not have enough Spider Eyes to buy this.");
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                } else {
                                    System.out.println("You have bought a Spider Web!");
                                    int tempTL = atom.getSpiderEye() - 5;
                                    atom.setSpiderEye(tempTL);
                                    for (int b = 0; b < 10; i++) {
                                        if (atom.inventory[b] == null) {
                                            atom.inventory[b] = ("Spider Web");
                                            System.out.println(Arrays.toString(atom.inventory));
                                            System.out.println(" ");
                                            System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                            userInput = scan.nextInt();
                                            if (userInput == 1) {
                                                break;
                                            } else {
                                                System.out.println("Thank you, come again soon dear!");
                                                keepShopping = false;
                                                break;
                                            }
                                        } else {
                                            i++;
                                        }
                                    }
                                    System.out.println(" ");
                                    System.out.println("Would you like to buy something else? 1 = yes, 2 = no");
                                    userInput = scan.nextInt();
                                    if (userInput == 1) {
                                        break;
                                    } else {
                                        System.out.println("Thank you, come again soon dear!");
                                        keepShopping = false;
                                        break;
                                    }
                                }
                            }
                    }
                }
            } else {
                System.out.println("Come again soon dear!");
                keepShopping = false;
                break;
            }

        }
    }
}





