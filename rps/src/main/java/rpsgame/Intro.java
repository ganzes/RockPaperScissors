package rpsgame;

import java.util.Scanner;

public class Intro {

    public void playerName(){
        System.out.println("Welcome to RPS! What's your name?");
        Scanner playersChoices = new Scanner(System.in);
        String playerRealName  = playersChoices.next();
        System.out.println("So your name is " + playerRealName + "? Cool!");
    }
}
