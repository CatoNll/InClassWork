package FSA_Game;

import java.util.Scanner;

public class FSA_Game {
    public static void main(String[] args) throws InterruptedException {
        /*
        Character States

        Fire

        speed = 100
        Health  = 100

        Water

        speed = 50
        Health = 150

        Earth

        speed = 25
        health = 200

         */

        int playerHealth = 0;
        int computerHealth = 0;
        int playerSpeed = 0;
        int computerSpeed = 0;

        Scanner scan = new Scanner(System.in);
        boolean keepLooping = true;
        boolean characterLoop = true;

        System.out.println("Welcome to Monster Fights!!!");
        System.out.println("Press Enter to continue. Enter q to quite");
        String userImput = scan.nextLine().toLowerCase();

        String userCharacterName = null;

        while (keepLooping)
        {

            if (userImput.equals("q")) {
                System.out.println("Thanks for playing Monster Fights!!!");
                break;
            }
            int userCharacter = 0;
            System.out.println("Chose your character.");
            while (characterLoop) {
                System.out.println("Enter 1 to choose Fire. Enter 2 for Water. Enter 3 for Earth");
                int characterCourse = scan.nextInt();

                if (characterCourse == 1) {
                    System.out.println();
                    System.out.println("You have selected Fire");
                    userCharacter = userCharacter + 1;
                    characterLoop = false;
                } else if (characterCourse == 2) {
                    System.out.println();
                    System.out.println("You have selected Water");
                    userCharacter = userCharacter + 2;
                    characterLoop = false;
                } else if (characterCourse == 3) {
                    System.out.println();
                    System.out.println("You have selected Earth");
                    userCharacter = userCharacter + 3;
                    characterLoop = false;
                } else {
                    System.out.println("You entered an invalid input. Try entering 1, 2, or 3");
                }
            }


            switch (userCharacter) {
                case 1:
                    userCharacterName = "Fire";
                    break;

                case 2:
                    userCharacterName = "Water";
                    break;
                case 3:
                    userCharacterName = "Earth";
                    break;
            }

            int computerCharacter = (int) Math.round(0.5 + Math.random() * 3);
            Thread.sleep(900);

            if (computerCharacter == 1) {
                System.out.println();
                System.out.println("The Computer has selected Fire");
                characterLoop = false;
            } else if (computerCharacter == 2) {
                System.out.println();
                System.out.println("The Computer has selected Water");
                characterLoop = false;
            } else if (computerCharacter == 3) {
                System.out.println();
                System.out.println("The Computer has selected Earth");
                characterLoop = false;
            }
            String computerCharacterName = null;
            switch (computerCharacter) {
                case 1:
                    computerCharacterName = "Fire";
                    break;

                case 2:
                    computerCharacterName = "Water";
                    break;
                case 3:
                    computerCharacterName = "Earth";
                    break;
            }

            if (userCharacterName.equals("Fire")) {
                playerHealth = 100;
                playerSpeed = 100;
            } else if (userCharacterName.equals("Water")) {
                playerHealth = 150;
                playerSpeed = 50;
            } else if (userCharacterName.equals("Earth")) {
                playerHealth = 200;
                playerSpeed = 25;
            }

                if (computerCharacterName.equals("Fire")) {
                computerHealth = 100;
                computerSpeed = 100;
                } else if (computerCharacterName.equals("Water")) {
                computerHealth = 150;
                computerSpeed = 50;
                } else if (computerCharacterName.equals("Earth")) {
                computerHealth = 200;
                computerSpeed = 25;
                }
                System.out.println();
                System.out.println("Player Character: " + userCharacterName);
                System.out.println("Computer Character: " + computerCharacterName);
                System.out.println("Player Health: " + playerHealth);
                System.out.println("Computer Health: " + computerHealth);
                System.out.println("Player Speed: " + playerSpeed);
                System.out.println("Computer Speed: " + computerSpeed);
                System.out.println();

                if (computerHealth <= 0) {
                    System.out.println("The Player wins!!!!");
                    break;
                } else if (playerHealth <= 0) {
                    System.out.println("The computer wins!!!");
                    break;
                }

                System.out.println("Players turn!!!");
                System.out.println("Enter 1 for a light attack, enter 2 for a heavy attack, enter 3 for a heal");
                int userAttackChouse = scan.nextInt();
                System.out.println();

                if (userAttackChouse == 1) {
                    int attackDamage = (int) Math.round(10 + Math.random() * 30);
                    if (attackDamage <= 15) {
                        System.out.println("You dealt " + attackDamage + " damage to the enemy!!");
                        computerHealth = computerHealth - attackDamage;
                    } else if (attackDamage >= 15) {
                        System.out.println("You dealt " + attackDamage + " CRITICAL damage to the enemy!!");
                        computerHealth = computerHealth - attackDamage;
                    }
                } else if (userAttackChouse == 2) {
                    int attackDamage = (int) Math.round(30 + Math.random() * 60);
                    if (attackDamage <= 45) {
                        System.out.println("You dealt " + attackDamage + " damage to the enemy!!");
                        computerHealth = computerHealth - attackDamage;
                    } else if (attackDamage >= 45) {
                        System.out.println("You dealt " + attackDamage + " CRITICAL damage to the enemy!!");
                        computerHealth = computerHealth - attackDamage;
                    }
                } else if (userAttackChouse == 3) {
                    int healing = (int) Math.round(10 + Math.random() * 30);
                    if (healing <= 15) {
                        System.out.println("You healed for " + healing + " damage!!");
                        playerHealth = playerHealth + healing;
                    } else if (healing >= 15) {
                        System.out.println("You healed for a CRITICAL " + healing + " damage!!");
                        playerHealth = playerHealth + healing;
                    }
                }

                System.out.println();
                System.out.println("Computers turn!!!!");
                System.out.println();

                int computerChouse = (int) Math.round(0.5 + Math.random() * 3);

                String computerPlay = null;
                Thread.sleep(1000);

                switch (computerChouse) {
                    case 1:
                        computerPlay = "Light Attack";
                        break;

                    case 2:
                        computerPlay = "Heavy Attack";
                        break;
                    case 3:
                        computerPlay = "Heal";
                        break;
                }

                System.out.println("The computer uses " + computerPlay);
                System.out.println();

                Thread.sleep(1000);

                if (computerChouse == 1) {
                    int attackDamage = (int) Math.round(10 + Math.random() * 20);
                    System.out.println("The computer dealt " + attackDamage + " damage to you!!");
                    playerHealth = playerHealth - attackDamage;
                } else if (computerChouse == 2) {
                    int attackDamage = (int) Math.round(20 + Math.random() * 50);
                    System.out.println("The computer dealt " + attackDamage + " damage to you!!");
                    playerHealth = playerHealth - attackDamage;
                } else if (computerChouse == 3) {
                    int healing = (int) Math.round(10 + Math.random() * 30);
                    System.out.println("The computer healed for " + healing + " damage!!!");
                    computerHealth = computerHealth + healing;
                }
                System.out.println();
        }
    }
}
