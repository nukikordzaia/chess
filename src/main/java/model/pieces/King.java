package model.pieces;

import model.Color;
import model.board.Cell;

public class King extends Piece {
    private static final int rank = 100; //not correct but needed
    private boolean isCastled;

    public King(Color color, boolean isMoved, boolean canMove, String display, Cell location, boolean isCastled) {
        super(color, rank, isMoved, canMove, display, location);
        this.isCastled = isCastled;
    }

    public boolean isCastled() {
        return isCastled;
    }

    public void setCastled(boolean castled) {
        isCastled = castled;
    }

    @Override
    public boolean canPieceMove(Cell from, Cell to) {
        return false;
    }
}