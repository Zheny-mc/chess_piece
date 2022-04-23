package ru.netcraker.chesspieces.base;


import ru.netcraker.service.MovesService;

import java.util.ArrayList;
import java.util.List;

public abstract class Figure {
    protected char row;
    protected int column;
    protected MovesService movesService;

    public Figure() {
        movesService = new MovesService();
    }

    public Figure(char row, int column) {
        this.row = row;
        this.column = column;
        movesService = new MovesService();
    }

    public void setRow(char row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public List<String> getPossibleMoves() {
        return new ArrayList<>();
    }
}
