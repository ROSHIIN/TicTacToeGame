package org.example;
import java.util.Random;

public class AIPlayer extends Player {

    String name;
    char mark;

    AIPlayer(String name, char mark) {
        super(name, mark);
    }


//    AIPlayer(String name, char mark){
//        this.name = name;
//        this.mark = mark;
//    }

    public void makeMove(){
        int row;
        int col;
        do {
             Random r = new Random();
             row = r.nextInt(3);
             col = r.nextInt(3);
             System.out.println(row+ " " +col);
        }while (!isValidMove(row,col));

        TicTacToe.markBoard(row,col,mark);

    }

}
