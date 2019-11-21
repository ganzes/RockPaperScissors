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
        return playerRockPaperScissors;
    }

}
