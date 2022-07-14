package model.pieces;

import model.Color;
import model.board.Cell;

public class Pawn extends Piece {
    private static final int rank = 1;
    private static final String name = "Pawn";

    public Pawn(Color color,long id, boolean isMoved, boolean canMove, String display) {
        super(color, id, rank, name, isMoved, canMove, display);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { // consider if king is safe, check king
        if (!to.isBusy()) { //if cell is empty
            if (getDistanceForNum(from, to) == 2 && to.getLetter() == from.getLetter() && !isMoved()) { //move forward with 2 cell
                return isMoveReversed(from, to);
            }
            if (getDistanceForNum(from, to) == 1 && to.getLetter() == from.getLetter()) {  //move forward with 1 cell
                return isMoveReversed(from, to);
            }
        } else {
            if (getDistanceForNum(from, to) == 1 && getDistanceForLet(from, to) == 1
                    && !isYourPiece(this, to.getPiece())){ //move forward to kill the opponent
                if (!isMoveReversed(from, to)) {
                    //kill opponent here
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isMoveReversed(Cell from, Cell to) {  //reverse move check
        return (getColor() != Color.WHITE || to.getNumber() >= from.getNumber()) && (getColor() != Color.BLACK || to.getNumber() <= from.getNumber());
    }
}
