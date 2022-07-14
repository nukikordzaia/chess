package model.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import model.Color;
import model.pieces.Piece;

@AllArgsConstructor
@Getter
@Setter
public class Cell {
    private Color color;
    private Piece piece;
    private int number;
    private char letter;

    public boolean isBusy() {
        return piece != null;
    }
}
