package FSA_Game;

import java.util.Scanner;

public class FSA_Game {
    public static void main(String[] args) throws InterruptedException {

        int playerHealth = 100;
        int computerHealth = 100;

        Scanner scan = new Scanner(System.in);
        boolean keepLooping = true;

        System.out.println("Welcome to Monster Fights!!!");
        System.out.println("Press Enter to continue. Enter q to quite");
        String userImput = scan.nextLine().toLowerCase();

        while (keepLooping) {

            if (userImput.equals("q")) {
                System.out.println("Thanks for playing Monster Fights!!!");
                break;
            }

            System.out.println("Player Health: " + playerHealth);
            System.out.println("Computer Health: " + computerHealth);
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

            switch (computerChouse) { // converts the random number for the generator to rock, paper, or scissors
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
            } else if (userAttackChouse == 3) {
                int healing = (int) Math.round(10 + Math.random() * 30);
                System.out.println("The computer healed for " + healing + " damage!!!");
                computerHealth = computerHealth + healing;
            }
            System.out.println();
        }
    }
}
