package model;

public class Knight extends Piece {
    private static final int rank = 3;

    public Knight(Color color, boolean isMoved, boolean canMove, String display, Location location, boolean isCastled) {
        super(color, rank, isMoved, canMove, display, location);
    }

    @Override
    public boolean canPieceMove(Location location) {
        return false;
    }
}
