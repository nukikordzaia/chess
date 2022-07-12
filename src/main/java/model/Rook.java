package model;

public class Rook extends Piece {
    private static final int rank = 5;

    public Rook(Color color, boolean isMoved, boolean canMove, String display, Location location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Location location) {
        return false;
    }
}
