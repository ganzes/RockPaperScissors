package rpsgame;

import java.util.Scanner;

public class Intro {

    public String playerName(){
        System.out.println("Welcome to Rock Paper Scissors beautiful stranger! \n Kindly please tell me your name:");
        Scanner playersChoices = new Scanner(System.in);
        String playerRealName  = playersChoices.next();
        System.out.println("So your name is " + playerRealName + "? Very cool, very nice indeed!");
        return playerRealName;
    }

    public int playerRounds(){
        System.out.println("How many rounds would you kindly wish to play?");
        Scanner playersChoices = new Scanner(System.in);
        int playersChosenRound  = playersChoices.nextInt();
        System.out.println("So " + playersChosenRound + " it is! \nGet ready to rumble!");
        return playersChosenRound;
    }

}
