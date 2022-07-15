package model.pieces;

import model.Color;
import model.PieceName;
import model.board.Cell;

public class Bishop extends Piece {
    private static final int rank = 3;
    private static final PieceName name = PieceName.Bishop;

    public Bishop(Color color, long id, boolean isMoved, boolean canMove, String display) {
       super(color, id, rank, name, isMoved, canMove, display);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { // consider if king is safe, check king
        if (!to.isBusy()) {
            return (getDistanceForNum(from, to) == getDistanceForLet(from, to) && from.getColor() == to.getColor());
        } else {
            if (!isYourPiece(this, to.getPiece())) {
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}
