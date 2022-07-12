package model;

public class Queen extends Piece {
    private static final int rank = 9;

    public Queen(Color color, boolean isMoved, boolean canMove, String display,Location location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Location location) {
        return false;
    }
}
