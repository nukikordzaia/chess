package model;

import model.board.Cell;
import model.pieces.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Map<String, Cell>> board = new HashMap<>();
        //fill the board
        board.put(1, Collections.singletonMap("a", new Cell(Color.BLACK, new Rook(Color.WHITE, 1, false, false, "Rook"), 1, 'a')));
        board.put(1, Collections.singletonMap("b", new Cell(Color.WHITE, new Knight(Color.WHITE, 2, false, false, "Knight"), 1, 'b')));
        board.put(1, Collections.singletonMap("c", new Cell(Color.BLACK, new Bishop(Color.WHITE, 3, false, false, "Bishop"), 1, 'c')));
        board.put(1, Collections.singletonMap("d", new Cell(Color.WHITE, new Queen(Color.WHITE, 4, false, false, "Queen"), 1, 'd')));
        board.put(1, Collections.singletonMap("e", new Cell(Color.BLACK, new King(Color.WHITE, 5, false, false, "King", false), 1, 'e')));
        board.put(1, Collections.singletonMap("f", new Cell(Color.WHITE, new Bishop(Color.WHITE, 6, false, false, "Bishop"), 1, 'f')));
        board.put(1, Collections.singletonMap("g", new Cell(Color.BLACK, new Knight(Color.WHITE, 7, false, false, "Knight"), 1, 'g')));
        board.put(1, Collections.singletonMap("h", new Cell(Color.WHITE, new Rook(Color.WHITE, 8, false, false, "Rook"), 1, 'h')));
        board.put(2, Collections.singletonMap("a", new Cell(Color.BLACK, new Pawn(Color.WHITE, 9, false, false, "Pawn"), 2, 'a')));
        board.put(2, Collections.singletonMap("b", new Cell(Color.WHITE, new Pawn(Color.WHITE, 10, false, false, "Pawn"), 2, 'b')));
        board.put(2, Collections.singletonMap("c", new Cell(Color.BLACK, new Pawn(Color.WHITE, 11, false, false, "Pawn"), 2, 'c')));
        board.put(2, Collections.singletonMap("d", new Cell(Color.WHITE, new Pawn(Color.WHITE, 12, false, false, "Pawn"), 2, 'd')));
        board.put(2, Collections.singletonMap("e", new Cell(Color.BLACK, new Pawn(Color.WHITE, 13, false, false, "Pawn"), 2, 'e')));
        board.put(2, Collections.singletonMap("f", new Cell(Color.WHITE, new Pawn(Color.WHITE, 14, false, false, "Pawn"), 2, 'f')));
        board.put(2, Collections.singletonMap("g", new Cell(Color.BLACK, new Pawn(Color.WHITE, 15, false, false, "Pawn"), 2, 'g')));
        board.put(2, Collections.singletonMap("h", new Cell(Color.WHITE, new Pawn(Color.WHITE, 16, false, false, "Pawn"), 2, 'h')));
        board.put(3, Collections.singletonMap("a", new Cell(Color.BLACK, null, 3, 'a')));
        board.put(3, Collections.singletonMap("b", new Cell(Color.WHITE, null, 3, 'b')));
        board.put(3, Collections.singletonMap("c", new Cell(Color.BLACK, null, 3, 'c')));
        board.put(3, Collections.singletonMap("d", new Cell(Color.WHITE, null, 3, 'd')));
        board.put(3, Collections.singletonMap("e", new Cell(Color.BLACK, null, 3, 'e')));
        board.put(3, Collections.singletonMap("f", new Cell(Color.WHITE, null, 3, 'f')));
        board.put(3, Collections.singletonMap("g", new Cell(Color.BLACK, null, 3, 'g')));
        board.put(3, Collections.singletonMap("h", new Cell(Color.WHITE, null, 3, 'h')));
        board.put(4, Collections.singletonMap("a", new Cell(Color.BLACK, null, 4, 'a')));
        board.put(4, Collections.singletonMap("b", new Cell(Color.WHITE, null, 4, 'b')));
        board.put(4, Collections.singletonMap("c", new Cell(Color.BLACK, null, 4, 'c')));
        board.put(4, Collections.singletonMap("d", new Cell(Color.WHITE, null, 4, 'd')));
        board.put(4, Collections.singletonMap("e", new Cell(Color.BLACK, null, 4, 'e')));
        board.put(4, Collections.singletonMap("f", new Cell(Color.WHITE, null, 4, 'f')));
        board.put(4, Collections.singletonMap("g", new Cell(Color.BLACK, null, 4, 'g')));
        board.put(4, Collections.singletonMap("h", new Cell(Color.WHITE, null, 4, 'h')));
        board.put(5, Collections.singletonMap("a", new Cell(Color.BLACK, null, 5, 'a')));
        board.put(5, Collections.singletonMap("b", new Cell(Color.WHITE, null, 5, 'b')));
        board.put(5, Collections.singletonMap("c", new Cell(Color.BLACK, null, 5, 'c')));
        board.put(5, Collections.singletonMap("d", new Cell(Color.WHITE, null, 5, 'd')));
        board.put(5, Collections.singletonMap("e", new Cell(Color.BLACK, null, 5, 'e')));
        board.put(5, Collections.singletonMap("f", new Cell(Color.WHITE, null, 5, 'f')));
        board.put(5, Collections.singletonMap("g", new Cell(Color.BLACK, null, 5, 'g')));
        board.put(5, Collections.singletonMap("h", new Cell(Color.WHITE, null, 5, 'h')));
        board.put(6, Collections.singletonMap("a", new Cell(Color.BLACK, null, 6, 'a')));
        board.put(6, Collections.singletonMap("b", new Cell(Color.WHITE, null, 6, 'b')));
        board.put(6, Collections.singletonMap("c", new Cell(Color.BLACK, null, 6, 'c')));
        board.put(6, Collections.singletonMap("d", new Cell(Color.WHITE, null, 6, 'd')));
        board.put(6, Collections.singletonMap("e", new Cell(Color.BLACK, null, 6, 'e')));
        board.put(6, Collections.singletonMap("f", new Cell(Color.WHITE, null, 6, 'f')));
        board.put(6, Collections.singletonMap("g", new Cell(Color.BLACK, null, 6, 'g')));
        board.put(6, Collections.singletonMap("h", new Cell(Color.WHITE, null, 6, 'h')));
        board.put(7, Collections.singletonMap("a", new Cell(Color.BLACK, new Pawn(Color.BLACK, 17, false, false, "Pawn"), 7, 'a')));
        board.put(7, Collections.singletonMap("b", new Cell(Color.WHITE, new Pawn(Color.BLACK, 18, false, false, "Pawn"), 7, 'b')));
        board.put(7, Collections.singletonMap("c", new Cell(Color.BLACK, new Pawn(Color.BLACK, 19, false, false, "Pawn"), 7, 'c')));
        board.put(7, Collections.singletonMap("d", new Cell(Color.WHITE, new Pawn(Color.BLACK, 20, false, false, "Pawn"), 7, 'd')));
        board.put(7, Collections.singletonMap("e", new Cell(Color.BLACK, new Pawn(Color.BLACK, 21, false, false, "Pawn"), 7, 'e')));
        board.put(7, Collections.singletonMap("f", new Cell(Color.WHITE, new Pawn(Color.BLACK, 22, false, false, "Pawn"), 7, 'f')));
        board.put(7, Collections.singletonMap("g", new Cell(Color.BLACK, new Pawn(Color.BLACK, 23, false, false, "Pawn"), 7, 'g')));
        board.put(7, Collections.singletonMap("h", new Cell(Color.WHITE, new Pawn(Color.BLACK, 24, false, false, "Pawn"), 7, 'h')));
        board.put(8, Collections.singletonMap("a", new Cell(Color.BLACK, new Rook(Color.BLACK, 25, false, false, "Rook"), 8, 'a')));
        board.put(8, Collections.singletonMap("b", new Cell(Color.WHITE, new Knight(Color.BLACK, 26, false, false, "Knight"), 8, 'b')));
        board.put(8, Collections.singletonMap("c", new Cell(Color.BLACK, new Bishop(Color.BLACK, 27, false, false, "Bishop"), 8, 'c')));
        board.put(8, Collections.singletonMap("d", new Cell(Color.WHITE, new Queen(Color.BLACK, 28, false, false, "Queen"), 8, 'd')));
        board.put(8, Collections.singletonMap("e", new Cell(Color.BLACK, new King(Color.BLACK, 29, false, false, "King", false), 8, 'e')));
        board.put(8, Collections.singletonMap("f", new Cell(Color.WHITE, new Bishop(Color.BLACK, 30, false, false, "Bishop"), 8, 'f')));
        board.put(8, Collections.singletonMap("g", new Cell(Color.BLACK, new Knight(Color.BLACK, 31, false, false, "Knight"), 8, 'g')));
        board.put(8, Collections.singletonMap("h", new Cell(Color.WHITE, new Rook(Color.BLACK, 32, false, false, "Rook"), 8, 'h')));
    }
}
