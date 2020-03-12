import java.util.Scanner;


public class Human extends Player {
    private String name;


    public Human() {
        super("Human");
    }

   public void setName() {
        System.out.print("Please enter a username");
        Scanner usrnm = new Scanner(System.in);
        String usrName = usrnm.next();
        System.out.println("Your username will be " + usrName + " for the rest of the game. Are you sure you want that name?");
        Scanner yesNo = new Scanner(System.in);
        String ans = yesNo.next();
        if (ans.toLowerCase().equals("yes")) {
            System.out.println("Okay! Good choice");
        } else if (ans.toLowerCase().equals("no")) {
            System.out.println("Please enter your new username (this will be your final one)");
            Scanner newName = new Scanner(System.in);
            String lastName = newName.next();
            System.out.println("Your username will be " + lastName + " for the rest of the game.");
        } else {
            System.out.println("Please enter 'yes' or 'no'");
            Scanner isYesNo = new Scanner(System.in);
            String answer = isYesNo.next();
            if (answer.toLowerCase().equals("yes")) {
                System.out.println("Okay! Good choice");
            } else if (answer.toLowerCase().equals("no")) {
                System.out.println("Please enter your new username (this will be your final one)");
                Scanner nName = new Scanner(System.in);
                String lName = nName.next();
                System.out.println("Your username will be " + lName + " for the rest of the game.");
            } else {
                setName();
            }
        }
    }

    public void slap(String[] pile){
        Scanner slap = new Scanner(System.in);
        String didSlap = slap.next();
        if(didSlap.equals("!") && isSlappeable(pile).equals(true) /* && time == 1 second */){
            this.gainCards(pile);
        }
    }


}