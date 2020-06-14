import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class GameBoard {

    private static int ID = 0;
    private Tile[] Board;
    private int Cycle;
    private Player[] players;
    private int MadeCycle;
    private Object initSymbol;
    private int Pos;
    private Object Symbol;
    private Object Name;


    // Първоначални позиции.

    private void GameBoard() {

        int id = 1, i = 0;
        Board[0] = new Tile(0, 0);
        for (i = 0; i <= 3; i++) Board[i] = new Tile(id, i);
        id = 2;
        for (; i <= 6; i++) Board[i] = new Tile(id, i);
        id = 3;
        for (; i <= 9; i++) Board[i] = new Tile(id, i);
        id = 4;
        for (; i <= 12; i++) Board[i] = new Tile(id, i);
        id = 5;
        for (; i <= 19; i++) Board[i] = new Tile(id, i);


    }

    // Избиране броя на ботовете за участие.

    public void BotQuantity() {

        System.out.print("Избери броя на участниците");
        Scanner scanner = null;
        int quantity = scanner.nextInt();

    }

    //Цикъл за едно пълно завъртане на играчите.
    public void Cycle() {

        Cycle++;
        boolean CycleOver = false;
        while (CycleOver) {
            printBoard();
            playerCycle();
            shuffleBoard();

        }
    }

    //Разбъркване позициите на играчите.

    private void shuffleBoard() {

        for (int i = 0; i <= 19; i++) {
            if (Board[i].Name().equals("Старт")) {
                Pos = i;
                Symbol = Board[19].getSymbol();
                Name = Board[19].getName();
                initSymbol = Board[19].getInitSymbol();
                ID = i;
                break;
            }
        }
    }

    //Цикъл за играчите.

    private void playerCycle() {

        for (Player currentPlayer : players) {
            if (currentPlayer.cycle == Cycle) {
                currentPlayer.Turn();
                if (currentPlayer.pos > 19) {
                    currentPlayer.pos = 0;
                    currentPlayer.cycle++;
                    System.out.println();
                }
                System.out.println();
                Board[currentPlayer.pos].setTile(currentPlayer);

            } else MadeCycle++;
        }
    }

    //Визуация на дъската.

            private void printBoard () {

                for (int i = 0; i <= 19; i++) {
                    System.out.printf("      \"|*|\", \"|X|\", \"|X|\", \"|X|\", \"|X|\",\n" +
                            "                \"|X|\", \"|X|\", \"|X|\", \"|X|\", \"|X|\",\n" +
                            "                \"|X|\", \"|X|\", \"|X|\", \"|X|\", \"|X|\",\n" +
                            "                \"|X|\", \"|X|\", \"|X|\", \"|X|\", \"|X|\"};" );

                }
                }
            }
