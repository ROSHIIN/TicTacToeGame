package org.example;

public class Main {
    public static void main(String[] args) {

        TicTacToe.initialiseBoard();
        Player currentPlayer;


        HumanPlayer p1 = new HumanPlayer("Roshin", 'X');
        AIPlayer p2 = new AIPlayer("AI", 'O');
        currentPlayer = p1;
        System.out.println(currentPlayer.mark);


        while (true){

            System.out.println(currentPlayer.name + "'s turn");

            currentPlayer.makeMove();
            TicTacToe.displayBoard();

            if (TicTacToe.columnWinCheck() || TicTacToe.rowWinCheck() || TicTacToe.diagWinCheck()) {
                System.out.println(currentPlayer.name + " HAS WON !!!");
                break;
            } else if (TicTacToe.drawCheck()) {
                System.out.println("GAME IS DRAW");
                break;
            } else {
                if (currentPlayer == p1) {
                    currentPlayer = p2;
                } else {
                    currentPlayer = p1;
                }
            }
        }
    }

}