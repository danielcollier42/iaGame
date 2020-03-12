import java.util.*;


public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
//        human.setName();

        String[] pile = new String[52];

        Computer computer = new Computer("Wall-e");

        Card card = new Card();

        //giveRules();

        //testIfReady();

        String[] allCards = {
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

        card.shuffleDeal(allCards, human, computer);

        String turn = card.findTurn();
        if(turn.equals("human")){
            System.out.println("It's your turn, please type '#' to play the top card of your hand onto the pile");
            Scanner place = new Scanner(System.in);
            String ready = place.next();
            if(ready.equals("#")) {
                human.putCard(pile, human.getHand());
            }
        } else if (turn.equals("computer")){
            //sleep(5000);
            computer.putCard(pile, computer.getHand());
        }



        //System.out.println("Your hand is: " + arrToStr(human.getHand()));
        //System.out.println("The computers hand is: " + arrToStr(computer.getHand()));
    }

    public static void giveRules() {
//        long startTime = System.currentTimeMillis();
//        long totalTime = System.currentTimeMillis() - startTime;
//        long totalSeconds = totalTime / 1000;

        System.out.println("You are playing Middle Eastern Llama Dash, here are the rules:");

        System.out.println("First, you and the computer will each be dealt 26 random cards. You will not know what values they hold.");

        System.out.println("You two will take turns (starting with you) placing your top cards, face-up, in a pile. To place your card, simply type '#'.");

        System.out.println("If the card placed down is a number card, the next player plays their top card. This continues until a face or ace card is placed down.");

        System.out.println("Once a face or ace card is played, the next person must play a face (or ace) card to continue play.");

        System.out.println("If the next player does not play a face (or ace) card, they lose and the pile goes to the other player. The winner begins the next round.");

        System.out.println("The last and most important aspect of play is 'slapping.' This occurs when:");
        System.out.println("    1) there are two of the same cards in a row");
        System.out.println("    2) There is a 'sandwich' of cards; meaning there is a card of one value, followed by a card of another value, which is then followed by a card of the first value");
        System.out.println("    3) The top and bottom cards are of the same value");

        System.out.println("In this case, the first player to slap wins the pile and begins the next round. To slap, type '!'. Play continues until one player has all of the cards.");
        System.out.println("If you incorrectly slap, the other player wins the round.");
    }

    public static String arrToStr(String[] arr){
        String str = "";
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != null){
               str += (arr[i]) + ", ";
           }
        }
        return str;
    }

    public static void testIfReady(){
        System.out.println("Please type 'ready' when you are ready to begin");
        Scanner isReady = new Scanner(System.in);
        String yesNo = isReady.next();
        if (yesNo.toLowerCase().equals("ready")) {
            System.out.println("Okay! Lets begin");
        } else {
            testIfReady();
        }
    }

   // private String[] pile = new String[52];

//    public static void shuffleDeal(String[] allCards, Human human, Computer computer){
//        String[] computerHand = new String[52];
//        String[] humanHand = new String[52];
//        for(int i = 0; i < allCards.length; i++){
//            Random card = new Random();
//            int a = card.nextInt(52);
//            String cardHolder = allCards[i];
//            allCards[i] = allCards[a];
//            allCards[a] = cardHolder;
//        }
//        for(int n = 0; n < allCards.length / 2; n++){
//            humanHand[n] = allCards[n];
//        }
//        for(int x = 0; x    < (allCards.length / 2); x++){
//            computerHand[x] = allCards[5/*(allCards.length / 2)+ x*/];
//        }
//        human.setHand(humanHand);
//        computer.setHand(computerHand);
//    }
}