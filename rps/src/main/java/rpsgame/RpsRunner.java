package rpsgame;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class RpsRunner {
    public static void main(String[] args) {
        Turtorial turtorial = new Turtorial();
        Intro intro = new Intro();

        intro.playerName();

        System.out.println("How many rounds you wish to play?");
        Scanner playersChoices = new Scanner(System.in);
        int playersChosenRound  = playersChoices.nextInt();
        System.out.println("So " + playersChosenRound + " it is! Get ready to rumble!");


        turtorial.turtorialInfo();

        Random random = new Random();
        int pcChoice = random.nextInt(3) +1;


        int i;
        for (i =1 ; i < playersChosenRound; i++){
            System.out.println("Rozpoczecie rundy " + i + "\n Wybierz swoj ruch!");

            int playerRockPaperScissors = playersChoices.nextInt();

            if(playerRockPaperScissors == 1){
                System.out.println("wybrales kamien");
            } else if (playerRockPaperScissors == 2){
                System.out.println("wybrales nozyce");
            } else if (playerRockPaperScissors == 3){
                System.out.println("wybrales nozyce");
            }


            System.out.println("Co teraz?");

        }

        /*boolean end = false;
        while (!end){
        }*/

    }
}
