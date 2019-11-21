package rpsgame;

public class Game {

    public void newGame(){

        Player player = new Player();
        Turtorial turtorial = new Turtorial();
        Intro intro = new Intro();

        String realName = intro.playerName();
        int playerExecuteRound = intro.playerRounds();

        turtorial.turtorialInfo();

        int i;
        int playerWin = 0;
        int pcWin = 0;

        for (i =1 ; i < playerExecuteRound; i++){
            System.out.println("We are now starting " + i + " round!\n Choose your move!");

            int playerMove = player.humanMove();

            if(playerMove == player.computerMove()){
                System.out.println("Rock " + player.computerMove() + " tie!");
            } else if (playerMove == 1 && player.computerMove() == 2){
                System.out.println("wybrales kamien a pc papier bo wybral " + player.computerMove() + " wiec przegrales");
                pcWin++;
            } else if (playerMove == 1 && player.computerMove() == 3){
                System.out.println("wybrales kamien a pc nozyce bo wybral " + player.computerMove() + " wiec wygrales");
                playerWin++;
            }

            if(playerMove == player.computerMove()){
                System.out.println("wybrales papier a pc papier bo wybral " + player.computerMove() + " wiec remis!");
            } else if (playerMove == 2 && player.computerMove() == 1){
                System.out.println("wybrales papier a pc nozyce bo wybral " + player.computerMove() + " wiec przegrales");
                pcWin++;
            } else if (playerMove == 2 && player.computerMove() == 3){
                System.out.println("wybrales papier a pc kamien bo wybral " + player.computerMove() + " wiec wygrales");
                playerWin++;
            }

            if(playerMove == player.computerMove()){
                System.out.println("wybrales nozyce a pc nozyce bo wybral " + player.computerMove() + " wiec remis!");
            } else if (playerMove == 3 && player.computerMove() == 1){
                System.out.println("wybrales nozyce a pc kamien bo wybral " + player.computerMove() + " wiec przegrales");
                pcWin++;
            } else if (playerMove == 3 && player.computerMove() == 2){
                System.out.println("wybrales nozyce a pc papier bo wybral " + player.computerMove() + " wiec wygrales");
                playerWin++;
            }

            System.out.println("Co teraz?\n" + realName + " twoja wygrana \n" + playerWin);

        }

        System.out.println("Ostateczna wygrana:\n" + "Zdobyłeś " + playerWin + " punktow!" + "\nPC zdobył " + pcWin + " punktow");

        if (playerWin > pcWin){
            System.out.println(realName + "\nWygrałes!");
        } else if (playerWin < pcWin){
            System.out.println(realName + "\nPrzegrales!");
        } else System.out.println("Remis!");

        /*boolean end = false;
        while (!end){
        }*/

    }
}
