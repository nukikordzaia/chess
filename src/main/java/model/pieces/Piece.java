package model.pieces;

import model.Color;
import model.board.Cell;

public abstract class Piece {
    private Color color;
    private int rank;
    private boolean isMoved;
    private boolean canMove;
    private String display;
    private Cell location;

    public Piece(Color color, int rank, boolean isMoved, boolean canMove, String display, Cell location) {
        this.color = color;
        this.rank = rank;
        this.isMoved = isMoved;
        this.canMove = canMove;
        this.display = display;
        this.location = location;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isMoved() {
        return isMoved;
    }

    public void setIsMoved(boolean isMoved) {
        this.isMoved = isMoved;
    }

    public boolean canMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Cell getLocation() {
        return location;
    }

    public void setLocation(Cell location) {
        this.location = location;
    }

    public abstract boolean canPieceMove(Cell from, Cell to);

    public void move(Cell from, Cell to) {

    }

    public int getDistanceForNum(Cell from, Cell to) {
       return Math.abs(to.getNumber() - from.getNumber());
    }

    public int getDistanceForLet(Cell from, Cell to) {
        return Math.abs(to.getLetter() - from.getLetter());
    }
}