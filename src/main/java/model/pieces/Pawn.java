package model.pieces;

import model.Color;
import model.board.Cell;

public class Pawn extends Piece {
    private static final int rank = 1;

    public Pawn(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        if (!to.isBusy()) {
            if (Math.abs(to.getNumber() - from.getNumber()) == 2 && to.getLetter() == from.getLetter() && !isMoved()) { //move forward with 2 cell
                return isMoveReversed(from, to);
            }
            if (Math.abs(to.getNumber() - from.getNumber()) == 1 && to.getLetter() == from.getLetter()) {  //move forward with 1 cell
                return isMoveReversed(from, to);
            }
        } else {
            if (Math.abs(to.getNumber() - from.getNumber()) == 1 && (to.getLetter() - 1 == from.getLetter() || to.getLetter() + 1 == from.getLetter()
                    && to.getPiece().getColor() != getColor())) { //move forward to kill the opponent
                if (!isMoveReversed(from, to)) {
                    //kill opponent here
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public void move(Cell from, Cell to) {

    }

    private boolean isMoveReversed(Cell from, Cell to) {  //reverse move check
        return (getColor() != Color.WHITE || to.getNumber() >= from.getNumber()) && (getColor() != Color.BLACK || to.getNumber() <= from.getNumber());
    }
}
