package model.pieces;

import model.Color;
import model.board.Cell;

public class Bishop extends Piece {
    private static final int rank = 3;

    public Bishop(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        return false;
    }
}
