import java.util.*;



public class Player {
    public static int turnCount = 0;
    private String name;
    private int numCards;
    private int score;
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
    private String[] hand = new String[52];

    public Player(String name) {
        this.name = name;
        this.numCards = 26;
        this.score = this.numCards;
    }

    public void testWin(String[] humanHand) {
        if (humanHand.length == 52) {
            System.out.println("You win!!!");
        } else if (humanHand.length == 0) {
            System.out.println("You lose");
        }
    }

    public void gainCards(String[] pile) {
        int score = this.getScore();
        int numCards = this.numCards;
        score += pile.length;
        this.setScore(score);
        for (int i = 0; i < pile.length; i++) {
            String card = this.hand[i];
            this.hand[i] = pile[i];
        }
    } //Needs to be checked and tested


    public String[] getCards(String[] cardsArr) {
        return cardsArr;
    }


    public String[] getHand(){
        return this.hand;
    }


    public void setHand(String[] cards){
        this.hand = cards;
    }


    public void setCards(int cards) {
        this.numCards = cards;
    }

    public int getScore() {
        int score = this.hand.length;
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }

    public String findTopCard() {
        String card = (this.hand[this.hand.length - 1]);
        this.hand[this.hand.length - 1] = null;
        return card;
    }


    public int getRealLength(String[] str){
        int count = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i] != null){
                count++;
            }
        }
        return count;
    }

    public void putCard(String[] pile, String[] thisHand){
        String placeholder = thisHand[(getRealLength(thisHand))];
        thisHand[(getRealLength(thisHand) - 1)] = null;
        pile[(getRealLength(pile) - 1)] = placeholder;
        turnCount++;
    }


}


