import java.util.*;

public class Card {
    private int cards;
    private String[] allCards = {
        "Ace ♠️", "Ace ♥️", "Ace ♣️", "Ace ♦️",
                "2 ♠️", "2 ♥️", "2 ♣️", "2 ♦️",
                "3 ♠️", "3 ♥️", "3 ♣️", "3 ♦️",
                "4 ♠️", "4 ♥️", "4 ♣️", "4 ♦️",
                "5 ♠️", "5 ♥️", "5 ♣️", "5 ♦️",
                "6 ♠️", "6 ♥️", "6 ♣️", "6 ♦️",
                "7 ♠️", "7 ♥️", "7 ♣️", "7 ♦️",
                "8 ♠️", "8 ♥️", "8 ♣️", "8 ♦️",
                "9 ♠️", "9 ♥️", "9 ♣️", "9 ♦️",
                "10 ♠️", "10 ♥️", "10 ♣️", "10 ♦️",
                "Jack ♠️", "Jack ♥️", "Jack ♣️", "Jack ♦️",
                "Queen ♠️", "Queen ♥️", "Queen ♣️", "Queen ♦️",
                "King ♠️", "King ♥️", "King ♣️", "King ♦️"
    };

    public Card() {
        //constructor
    }

    public void shuffleDeal(String[] allCards, Human human, Computer computer){
        String[] computerHand = new String[52];
        String[] humanHand = new String[52];
        for(int p = 0; p < 10; p++) {
            for (int i = 0; i < allCards.length; i++) {
                Random card = new Random();
                int a = card.nextInt(52);
                String cardHolder = allCards[i];
                allCards[i] = allCards[a];
                allCards[a] = cardHolder;
            }
        }
        for(int n = 0; n < allCards.length / 2; n++){
            humanHand[n] = allCards[n];
        }
        for(int x = 0; x < (allCards.length / 2); x++){
            computerHand[x] = allCards[(allCards.length / 2)+ x];
        }
        human.setHand(humanHand);
        computer.setHand(computerHand);
    }

    public String findTurn(){
        int turnCt = Player.turnCount;
        if(turnCt % 2 == 0){
            return "human";
        } else {
            return "computer";
        }
    }

    public Boolean isSlappeable(String[] pile){
        int length = pile.length - 1;
        String firstNum = pile[0].substring(0,1);
        String lastNum = pile[length].substring(0,1);
        String secLastNum = pile[length - 1].substring(0,1);
        String sandwitchNum = pile[length - 2].substring(0,1);
        if(lastNum.equals(secLastNum) || lastNum.equals(sandwitchNum) || lastNum.equals(firstNum)){
            return true;
        } else {
            return false;
        }
    }

}
