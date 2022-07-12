package model;

import java.util.Map;

public class Pawn extends Piece {

    @Override
    public boolean canPieceMove(Map<String, Integer> from, Map<String, Integer> to) {
        return false;
    }
}
