import java.util.*;


public class Computer extends Player {
    private String name;


    public Computer(String name){
        super("Computer");
    }

    public void randomSlap(){
        int num = 1;

    }

    String[] hand = this.getHand();

    public void slap(String[] pile, Boolean isSlappeable){
        double startTime = System.currentTimeMillis();
        double totalTime = System.currentTimeMillis() - startTime;
        double secondsElapsed = totalTime / 1000;
        double timeToSlap = 0;
        if(this.hand.length >= 30){
            timeToSlap = 2;
        } else if(this.hand.length < 30 && this.hand.length >= 15){
            timeToSlap = 1.5;
        } else if(this.hand.length < 15){
            timeToSlap = 1;
        }
        if(isSlappeable.equals(true) && timeToSlap == secondsElapsed){
            System.out.println("You were too slow to slap!");
            this.gainCards(pile);
        }
    }
}
