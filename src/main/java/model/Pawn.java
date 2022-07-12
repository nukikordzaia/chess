package model;

public class Pawn extends Piece {
    private static final int rank = 1;

    public Pawn(Color color, boolean isMoved, boolean canMove, String display, Location location) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Location location) {
            return false;
    }
}
