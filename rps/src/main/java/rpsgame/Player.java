package rpsgame;

import java.util.Random;
import java.util.Scanner;

public class Player {

    public int computerMove() {
        Random random = new Random();
        int pcRockPaperScissors = random.nextInt(3) + 1;
        return pcRockPaperScissors;
    }

    public int humanMove() {
        Scanner playersChoices = new Scanner(System.in);
        int playerRockPaperScissors = playersChoices.nextInt();
        if (playerRockPaperScissors != (1 | 2 | 3)) {
            System.out.println("Wrong number, try again: 1, 2, 3?");
        }
        return playerRockPaperScissors;
    }

    public void endgameChoice() {
        System.out.println("Press X to QUIT or N to start New Game!");
        Scanner endGame = new Scanner(System.in);
        String result = endGame.next();

        if (result.equals("X") || result.equals("x")) {
            System.out.println("Are you sure you want to QUIT? Press X to confirm!");
            Scanner endGameSecond = new Scanner(System.in);
            String resultSecond = endGameSecond.next();

            if (resultSecond.equals("X") || resultSecond.equals("x")) {
                System.out.println("I hope you will remember me kindly!");
                System.exit(1);
            } else System.out.println("Make up your mind!");
            Player player = new Player();
            player.endgameChoice();
        }

        if (result.equals("N") || result.equals("n")) {
            System.out.println("Are you sure you want to start NEW GAME? Press N to confirm!");
            Scanner endGameSecond = new Scanner(System.in);
            String resultSecond = endGameSecond.next();

            if (resultSecond.equals("N") || resultSecond.equals("n")) {
                System.out.println("Starting NEW GAME!");
                Game game = new Game();
                game.newGame();
            } else System.out.println("Make up your mind!");
            Player player = new Player();
            player.endgameChoice();
        }
    }
}