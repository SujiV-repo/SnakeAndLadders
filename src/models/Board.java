package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> board = new ArrayList<>();

    public Board(List<List<Cell>> board) {
        this.board = board;
    }
}
