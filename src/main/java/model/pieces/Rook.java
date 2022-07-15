package model.pieces;

import model.Color;
import model.PieceName;
import model.board.Cell;

public class Rook extends Piece {
    private static final int rank = 5;
    private static final PieceName name = PieceName.Rook;

    public Rook(Color color, long id, boolean isMoved, boolean canMove, String display) {
        super(color, id, rank, name, isMoved, canMove, display);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { // consider if king is safe, check king
        if (!to.isBusy()) {
            return (from.getNumber() == to.getNumber() || from.getLetter() == to.getLetter());
        } else {
            if (!isYourPiece(this, to.getPiece())) {  //move to kill the opponent
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}
