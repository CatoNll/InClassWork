public class gametest {


    public static void main(String[] args) {

        int cardAmount = 3;
        int playerCardsRule1 = 0;
        int computerCardsRule1 = 0;
        int playerCardsRule2 = 0;
        int computerCardsRule2 = 0;
        int round = 0;
        int playerScore = 0;
        int computerScore = 0;
        int gameRule = 0;
        int playerMoney = 0;
        int computerMoney = 0;
        int playerBet = 0;
        int computerBet = 0;

        int playerCards[] = new int[cardAmount]; // states the amount of cards the player will get
        int computerCards[] = new int[cardAmount]; // states the amount of cards the computer will get

        for (int i = 0; i < cardAmount; i++) {
            int playerCardNum = (int) (5 + Math.random()* 14.99); // chooses the players cards
            int computerCardNum = (int) (5 + Math.random()* 14.99); // chooses the computer cards
            playerCards[i] = playerCardNum; // states the players cards
            computerCards[i] = computerCardNum; // states the computers cards
        }

        System.out.print("Your cards are: "); // outputs the player cards
        for (int i = 0; i < cardAmount; i++) {
            System.out.print(playerCards[i] + ", ");
        }

        System.out.print("                   The computers cards are: "); // outputs the computers cards
        for (int i = 0; i < cardAmount; i++) {
            System.out.print(computerCards[i] + ", ");

        }
        System.out.println();



        //playerCardsRule2 = (playerCards[0] + playerCards[1] + playerCards[2])/cardAmount;
        //computerCardsRule2 = (computerCards[0] + computerCards[1] + computerCards[2])/cardAmount;

    }



}
