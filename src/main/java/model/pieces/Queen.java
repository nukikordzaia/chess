package model.pieces;

import model.Color;
import model.board.Cell;

public class Queen extends Piece {
    private static final int rank = 9;
    private static final String name = "Queen";

    public Queen(Color color,long id, boolean isMoved, boolean canMove, String display) {
        super(color, id, rank, name, isMoved, canMove, display);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { // consider if king is safe, check king
        if (!to.isBusy()) {
            return ((getDistanceForNum(from, to) == getDistanceForLet(from, to) && from.getColor() == to.getColor()) &&
                    (from.getNumber() == to.getNumber() || from.getLetter() == to.getLetter()));
        } else {
            if (!isYourPiece(this, to.getPiece())) {
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}
