package model.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@AllArgsConstructor
@Getter
@Setter
public class Board {
    private Map<Integer, Map<Character, Cell>> board;
}
