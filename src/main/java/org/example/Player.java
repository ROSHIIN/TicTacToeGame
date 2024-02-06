package org.example;

abstract public class Player {
    String name;
    char mark;

    Player(String name,char mark){
        this.name = name;
        this.mark = mark;

    }

    abstract void makeMove();

    public boolean isValidMove(int row,int col){
        if (row >= 0 && row <=2
                && col >=0 && col <=2)
        {
            if (TicTacToe.board[row][col] == ' '){
                return true;
            }
        }
        return false;
    }
}
