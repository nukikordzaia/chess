package model.pieces;

import model.Color;
import model.board.Cell;

public class Rook extends Piece {
    private static final int rank = 5;

    public Rook(Color color, boolean isMoved, boolean canMove, String display, Cell location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        return false;
    }
}
