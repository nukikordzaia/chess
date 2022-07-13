package model.pieces;

import model.Color;
import model.board.Cell;

public class Rook extends Piece {
    private static final int rank = 5;

    public Rook(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { //should consider castle with king
        if (!to.isBusy()) {
            return from.getNumber() == to.getNumber() || from.getLetter() == to.getLetter();
        } else {
            if (to.getPiece().getColor() != getColor()) {  //move to kill the opponent
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}
