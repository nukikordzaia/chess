package model.board;

import model.Color;
import model.pieces.Piece;

public class Cell {
    private Color color;
    private Piece piece;
    private int number;
    private char letter;

    public Cell(Color color, Piece piece, int number, char letter) {
        this.color = color;
        this.piece = piece;
        this.number = number;
        this.letter = letter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public boolean isBusy() {
        return piece != null;
    }
}
