package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }
}

class Mohreh {
    Scanner input = new Scanner(System.in);
    public String coler;

    public void InOut() {

    }

    int r = input.nextInt(), c = input.nextInt();
    public Position position = new Position(r, c);


    public void isValidMove() {

    }
}

class Sarbaz extends Mohreh {
    public void isValidMove() {

        boolean flag = false;
    }
}

class Vazir extends Mohreh {

}

class Shah extends Mohreh {

}

class Rokh extends Mohreh {

}

class Asb extends Mohreh {

}

class Fill extends Mohreh {

}

class Player {
    Sarbaz[] sarbazs =new Sarbaz[8];


    public void getWhitePlayer() {

    }

    public void getBlackPlayer() {

    }

    public void move() {

    }

}

class Position {
    public static final int ROW_COUNT = 8;
    public static final int COL_COUNT = 8;
    private int row;
    private int col;

    public Position(int row, int col) {
        setRow(row);
        setCol(col);
    }

    public void setRow(int row) {
        if (row > ROW_COUNT || row < 1) try {
            throw new InvalidRowException();
        } catch (InvalidRowException e) {
            e.printStackTrace();
        }
        else this.row = row;
    }

    public int getRow() {
        return row;
    }

    public void setCol(int col) {
        if (col > COL_COUNT || col < 1) try {
            throw new InvalidColException();
        } catch (InvalidColException e) {
            e.printStackTrace();
        }
        else this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void InvalidRowException() {

    }

    private class InvalidRowException extends Throwable {
    }

    private class InvalidColException extends Throwable {
    }
}