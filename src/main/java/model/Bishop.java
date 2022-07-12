package model;

public class Bishop extends Piece {
    private static final int rank = 3;

    public Bishop(Color color, boolean isMoved, boolean canMove, String display, Location location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Location location) {
        return false;
    }
}
