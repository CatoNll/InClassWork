package FSA_Game;

import java.util.Scanner;

public class FSA_Game_Test {
    public static void main(String[] args) {

        int round = 0;
        int playerHealth = 100;
        int computerHealth = 100;
        boolean playerBurn = false;
        boolean computerBurn = false;
        int playerBurnTime = 0;
        int computerBurnTime = 0;
        boolean keepLooping = true;
        int damage = 0;
        int tripleStrikeTotalDamage = 0;
        int fireAbilityCooldown2 = 0;
        int fireAbilityCooldown3 = 0;
        int fireAbilityCooldown4 = 0;
        boolean coolDowns = false;
        double damageBoost = 0;
        int damageBoostUptime = 0;
        int playerArmor = 0;
        int computerArmor = 20;
        int playerInput = 0;

        /*
        Fire ability

        1. basic strike
        - Low damage
        - Adds Bern damage

        2. attack buff

        - no damage
        - incenses damage

        3. Triple Strike

        - three different strike

        4.

        Rock ability

        1. Basic strike
        - Low damage
        - Add small amount of armor

        2. Defencev ability
        - adds armor
        - adds shield

        3. Stun attack
        - large amount of damage
        - Chance of a stun
         */

        // Fire Test

        Scanner scan = new Scanner(System.in);

        while (keepLooping) {
            round = round + 1;
            if (playerInput == 3) {
                computerHealth = computerHealth - damage;
            }

            if (playerBurn == true && playerBurnTime != 0) {
                int burn = (int) Math.round(5 + Math.random() * 20);
                playerHealth = playerHealth - burn;
                System.out.println("The Player has taken " + burn + " damage from BURN!!");
                playerBurnTime = playerBurnTime - 1;
            }
            if (computerBurn == true && computerBurnTime != 0) {
                int burn = (int) Math.round(5 + Math.random() * 20);
                computerHealth = computerHealth - burn;
                System.out.println("The computer has taken " + burn + " damage from BURN!!");
                computerBurnTime = computerBurnTime - 1;
            }
            if (fireAbilityCooldown2 != 0 || fireAbilityCooldown3 != 0 || fireAbilityCooldown4 != 0) {
                coolDowns = true;
            }
            if (coolDowns == true) {
                if (fireAbilityCooldown2 != 0) {
                    fireAbilityCooldown2 = fireAbilityCooldown2 - 1;
                }
                if (fireAbilityCooldown3 != 0) {
                    fireAbilityCooldown3 = fireAbilityCooldown3 - 1;
                }
                if (fireAbilityCooldown4 != 0) {
                    fireAbilityCooldown4 = fireAbilityCooldown4 - 1;
                }
            }
            if (damageBoostUptime != 0) {
                damageBoostUptime = damageBoostUptime - 1;
            }

            if (playerBurnTime == 0) {
                playerBurn = false;
            } else if (computerBurnTime <= 0) {
                computerBurn = false;
            }


            System.out.println("Round: " + round);
            System.out.println("Player Health: " + playerHealth);
            System.out.println("Computer Health: " + computerHealth);
            if (playerArmor != 0) {
                System.out.println("The player has " + playerArmor + " armor! Equal to " + playerArmor + "% damage reduction");
            }
            if (computerArmor != 0) {
                System.out.println("The computer has " + computerArmor + " armor! Equal to " + computerArmor + "% damage reduction");
            }
            if (playerBurn == true) {
                System.out.println("The player is effected by BURN for " + playerBurnTime + " rounds");
            }
            if (computerBurn == true) {
                System.out.println("The computer is effected by BURN for " + computerBurnTime + " rounds");
            }
            // 1. basic strike

            System.out.println("Enter 1 of a basic attack. Enter 2 damage boost. Enter 3 for Triple Strike");
            playerInput = scan.nextInt();
/*
            if (playerInput == 1) {
                damage = (int) Math.round(10 + Math.random() * 30);
                if (damageBoost != 0) {
                    double damageDub = Double.valueOf(damage);
                    damageDub = damage * damageBoost;
                    System.out.println("With your damage boost you delt " + Math.round(damageDub) + " to the Computer");
                } else {
                    System.out.println("The player dealt " + damage + " damage to the computer");
                }

                computerBurn = true;
                computerBurnTime = computerBurnTime + 3;

            }


 */
            // 2. Damage Boost
/*
            if (playerInput == 2) {
                damageBoost = 1.3;
                System.out.println("The player have increased their power by 30%");
            }
 */


            // 3. Triple strike

            if (playerInput == 3 && fireAbilityCooldown3 == 0) {
                int playerTripleStrike[] = new int[3];
                int tripleStrikeDamage[] = new int[3];
                for (int i = 0; i < playerTripleStrike.length; i++) {
                    damage = (int) Math.round(5 + Math.random() * 15);
                    tripleStrikeDamage[i] = damage;
                }
                System.out.print("Players three strikes dealt ");
                for (int i = 0; i < playerTripleStrike.length; i++) {
                    System.out.print(tripleStrikeDamage[i] + " ");
                    tripleStrikeTotalDamage = tripleStrikeTotalDamage + tripleStrikeDamage[i];
                }
                System.out.println("for the total of " + tripleStrikeTotalDamage + " damage!");
                computerHealth = computerHealth - tripleStrikeTotalDamage;
                fireAbilityCooldown3 = 4;

                // Rock Test

                if (playerInput == 1) {
                    damage = (int) Math.round(10 + Math.random() * 30);
                    System.out.println("The player dealt " + damage + " damage to the computer");
                    playerArmor += (int) Math.round(5 + Math.random() * 20);
                    System.out.println("The player gained " + playerArmor + " armor");

                }


            }
        }
    }
}