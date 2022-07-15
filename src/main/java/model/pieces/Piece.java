package model.pieces;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Color;
import model.PieceName;
import model.board.Cell;

@AllArgsConstructor
@Getter
@Setter
public abstract class Piece {
    private Color color;
    private long id;
    private int rank;
    private PieceName name;
    private boolean isMoved;
    private boolean canMove;
    private String display;

    public abstract boolean canPieceMove(Cell from, Cell to);

    public int getDistanceForNum(Cell from, Cell to) {
       return Math.abs(to.getNumber() - from.getNumber());
    }

    public int getDistanceForLet(Cell from, Cell to) {
        return Math.abs(to.getLetter() - from.getLetter());
    }

    public boolean isYourPiece(Piece firstPiece, Piece secondPiece) {
        return firstPiece.getColor() == secondPiece.getColor();
    }
}