package model.pieces;

import model.Color;
import model.PieceName;
import model.board.Board;
import model.board.Cell;

import java.util.Arrays;
import java.util.List;

public class King extends Piece {
    private static final int rank = 100; //not correct but needed
    private static final PieceName name = PieceName.King;
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

    private boolean canKingMoveToCell(Board board, Cell cell) {
        List<PieceName> pieceNames = Arrays.asList(PieceName.Pawn, PieceName.King, PieceName.Queen, PieceName.Bishop);
        if (getPieceFromCell(board, cell, 1, 1) != null) { //if cell is busy
            if (getPieceFromCell(board, cell, 1, 1).getColor() != getColor() && //check left top diagonal cell
                    (isDiagonalCellSafe(board, cell, getColor(), pieceNames)) ||
                    (getPieceFromCell(board, cell, 1, 2).getColor() != getColor() && //check right top diagonal cell
                            (isDiagonalCellSafe(board, cell, getColor(), pieceNames)))) {
                return false;

            }
        }
        return true;
    }

    private boolean isDiagonalCellSafe(Board board, Cell cell, Color color, List<PieceName> names) {
        int num;
        int let;
        if (color.equals(Color.WHITE)) {
            num = 1;
            let = 1;
        } else {
            num = -1;
            let = -1;
        }
        for (PieceName name : names) {
            if (getPieceFromCell(board, cell, num, let).getName().equals(name)) {
                return false;
            }
        }
        return true;
    }


    private Piece getPieceFromCell(Board board, Cell cell, int num, int let) {
        return board.getBoard().get(cell.getNumber() + num).get((char) (cell.getLetter() + let)).getPiece();
    }
}
