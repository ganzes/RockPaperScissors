package rpsgame;

import java.util.Random;
import java.util.Scanner;

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

        int i;
        int playerWin = 0;
        int pcWin = 0;
        for (i =1 ; i < playersChosenRound; i++){
            System.out.println("Rozpoczecie rundy " + i + "\n Wybierz swoj ruch!");

            Random random = new Random();
            int pcChoice = random.nextInt(3) +1;

            int playerRockPaperScissors = playersChoices.nextInt();
            int pcRockPaperScissors = pcChoice;

            if(playerRockPaperScissors == 1 && pcRockPaperScissors == 1){
                System.out.println("wybrales kamien a pc kamien bo wybral " + pcRockPaperScissors + " wiec remis!");

            } else if (playerRockPaperScissors == 1 && pcRockPaperScissors == 2){
                System.out.println("wybrales kamien a pc papier bo wybral " + pcRockPaperScissors + " wiec przegrales");
                pcWin++;
            } else if (playerRockPaperScissors == 1 && pcRockPaperScissors == 3){
                System.out.println("wybrales kamien a pc nozyce bo wybral " + pcRockPaperScissors + " wiec wygrales");
                playerWin++;
            }

            if(playerRockPaperScissors == 2 && pcRockPaperScissors == 2){
                System.out.println("wybrales papier a pc papier bo wybral " + pcRockPaperScissors + " wiec remis!");
            } else if (playerRockPaperScissors == 2 && pcRockPaperScissors == 1){
                System.out.println("wybrales papier a pc nozyce bo wybral " + pcRockPaperScissors + " wiec przegrales");
                pcWin++;
            } else if (playerRockPaperScissors == 2 && pcRockPaperScissors == 3){
                System.out.println("wybrales papier a pc kamien bo wybral " + pcRockPaperScissors + " wiec wygrales");
                playerWin++;
            }

            if(playerRockPaperScissors == 3 && pcRockPaperScissors == 3){
                System.out.println("wybrales nozyce a pc nozyce bo wybral " + pcRockPaperScissors + " wiec remis!");
            } else if (playerRockPaperScissors == 3 && pcRockPaperScissors == 1){
                System.out.println("wybrales nozyce a pc kamien bo wybral " + pcRockPaperScissors + " wiec przegrales");
                pcWin++;
            } else if (playerRockPaperScissors == 3 && pcRockPaperScissors == 2){
                System.out.println("wybrales nozyce a pc papier bo wybral " + pcRockPaperScissors + " wiec wygrales");
                playerWin++;
            }

            System.out.println("Co teraz? twoja wygrana \n" + playerWin);

        }

        System.out.println("Ostateczna wygrana:\n" + "Zdobyłeś " + playerWin + " punktow!" + "\nPC zdobył " + pcWin + " punktow");

        if (playerWin > pcWin){
            System.out.println("Wygrałes!");
        } else if (playerWin < pcWin){
            System.out.println("Przegrales!");
        } else System.out.println("Remis!");

        /*boolean end = false;
        while (!end){
        }*/

    }
}
