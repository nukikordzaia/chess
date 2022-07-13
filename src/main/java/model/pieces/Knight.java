package model.pieces;

import model.Color;
import model.board.Cell;

public class Knight extends Piece {
    private static final int rank = 3;

    public Knight(Color color, boolean isMoved, boolean canMove, String display, Cell location, boolean isCastled) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        return false;
    }
}
