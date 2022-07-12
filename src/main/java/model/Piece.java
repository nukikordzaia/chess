package model;

import java.util.Map;

public abstract class Piece {
    private Color color;
    private int rank;
    private boolean isMoved;
    private boolean canMove;
    private String display;
    private Map<String, Integer> location;

    public abstract boolean canPieceMove(Map<String, Integer> from, Map<String, Integer> to);
}