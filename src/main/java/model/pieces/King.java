package model.pieces;

import model.Color;
import model.board.Board;
import model.board.Cell;

public class King extends Piece {
    private static final int rank = 100; //not correct but needed
    private static final String name = "King";
    private boolean isCastled;

    public King(Color color,long id, boolean isMoved, boolean canMove, String display, boolean isCastled) {
        super(color, id, rank, name, isMoved, canMove, display);
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

//    private boolean isSafeCell(Board board, Cell cell) {
//
//    }
}
