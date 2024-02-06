package org.example;
import java.util.Scanner;


public class HumanPlayer extends Player {

    String name;
    char mark;

    HumanPlayer(String name, char mark) {
        super(name, mark);
    }

//    HumanPlayer(String name, char mark) {
//        this.name = name;
//        this.mark = mark;
//    }

    public void makeMove(){
        Scanner obj = new Scanner(System.in);
        int row;
        int col;
        do {
            System.out.println("ENTER ROW AND COLUMN");
            row = obj.nextInt();
            col = obj.nextInt();
        }while (!isValidMove(row,col));
        TicTacToe.markBoard(row,col,mark);

    }

}


