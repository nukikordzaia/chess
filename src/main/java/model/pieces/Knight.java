package model.pieces;

import model.Color;
import model.board.Cell;

public class Knight extends Piece {
    private static final int rank = 3;

    public Knight(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        if (!to.isBusy()) { //if cell is empty
            return (getDistanceForNum(from, to) >= 1 && getDistanceForNum(from, to) <= 2
                    && getDistanceForLet(from, to) >= 1 && getDistanceForLet(from, to) <= 2);
        } else {
            if (to.getPiece().getColor() != getColor()) {  //move to kill the opponent
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}