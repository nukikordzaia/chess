package model.pieces;

import model.Color;
import model.board.Cell;

public class Knight extends Piece {
    private static final int rank = 3;
    private static final String name = "Knight";

    public Knight(Color color, long id, boolean isMoved, boolean canMove, String display) {
        super(color, id, rank, name, isMoved, canMove, display);    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) { // consider if king is safe, check king
        if (!to.isBusy()) { //if cell is empty
            return (getDistanceForNum(from, to) >= 1 && getDistanceForNum(from, to) <= 2
                    && getDistanceForLet(from, to) >= 1 && getDistanceForLet(from, to) <= 2);
        } else {
            if (!isYourPiece(this, to.getPiece())) {  //move to kill the opponent
                //kill opponent here
                return true;
            }
        }
        return false;
    }
}