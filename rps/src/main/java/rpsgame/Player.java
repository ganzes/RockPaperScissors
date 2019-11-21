package rpsgame;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public int computerMove(){
        Random random = new Random();
        int pcRockPaperScissors = random.nextInt(3) +1;
        return pcRockPaperScissors;
    }

    public int humanMove(){
        Scanner playersChoices = new Scanner(System.in);
        int playerRockPaperScissors = playersChoices.nextInt();

        /*if (playerRockPaperScissors != (1|2|3)){
            System.out.println("Wrong number, try again: 1, 2, 3?");
        }*/

        return playerRockPaperScissors;
    }

    public void endgame(){
        System.out.println("Press X to QUIT or N to start New Game!");
        Scanner endGame = new Scanner(System.in);
        String result = endGame.next();

        if (result == "X"){
            System.out.println("BYE!");
        } else if(result == "N"){
            System.out.println("Starting NEW GAME!");
            Game game = new Game();
            game.newGame();
        }
    }
}
