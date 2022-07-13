package model.pieces;

import model.Color;
import model.board.Cell;

public class Queen extends Piece {
    private static final int rank = 9;

    public Queen(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        return false;
    }
}
