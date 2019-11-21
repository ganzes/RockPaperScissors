package rpsgame;

import java.util.Scanner;

public class Game {

    public void newGame() {

        boolean end = false;

        while (!end) {
            Player player = new Player();
            Turtorial turtorial = new Turtorial();
            Intro intro = new Intro();
            String realName = intro.playerName();
            int playerExecuteRound = intro.playerRounds();

            turtorial.turtorialInfo();

            int i;
            int playerWin = 0;
            int pcWin = 0;
            for (i = 1; i < playerExecuteRound; i++) {
                System.out.println("We are now starting " + i + " round!\n Choose your move!");

                int playerMove = player.humanMove();
                int pcMove = player.computerMove();

                if (playerMove == pcMove) {
                    System.out.println(realName + " chose ROCK!\n" + "Computer chose also ROCK! \n" + " TIE!");
                } else if (playerMove == 1 && pcMove == 2) {
                    System.out.println(realName + " chose ROCK!\n" + "Computer chose PAPER! " + "LOST");
                    pcWin++;
                } else if (playerMove == 1 && pcMove == 3) {
                    System.out.println(realName + " chose ROCK!\n" + "Computer chose SCISSORS! " + "WIN");
                    playerWin++;
                }

                if (playerMove == pcMove) {
                    System.out.println(realName + " chose PAPER!\n" + "Computer chose also PAPER!\n" + "TIE");
                } else if (playerMove == 2 && pcMove == 1) {
                    System.out.println(realName + " chose PAPER!\n" + "Computer chose SCISSORS!\n" + "LOST");
                    pcWin++;
                } else if (playerMove == 2 && pcMove == 3) {
                    System.out.println(realName + " chose PAPER!\n" + "Computer chose ROCK!\n" + "WIN");
                    playerWin++;
                }

                if (playerMove == pcMove) {
                    System.out.println(realName + " chose SCISSORS!\n" + "Computer chose also SCISSORS! \n" + " TIE!");
                } else if (playerMove == 3 && pcMove == 1) {
                    System.out.println(realName + " chose SCISSORS!\n" + "Computer chose ROCK!\n" + "LOST");
                    pcWin++;
                } else if (playerMove == 3 && pcMove== 2) {
                    System.out.println(realName + " chose SCISSORS!\n" + "Computer chose PAPER!\n" + "WIN");
                    playerWin++;
                }

                System.out.println("What's your move champ?\n" + realName + " have: \n" + playerWin + " points!" +
                        "\nComputer have " + pcWin + " points!");
            }

            System.out.println("Final Score:\n" + realName + " got " + playerWin + " points!" + "\nComputer got " + pcWin + " points!");

            if (playerWin > pcWin) {
                System.out.println(realName + "\nYou've won!");
            } else if (playerWin < pcWin) {
                System.out.println(realName + "\nYou've  lost!");
            } else System.out.println("You've both tie!");

            end = true;
        }
    }
}
