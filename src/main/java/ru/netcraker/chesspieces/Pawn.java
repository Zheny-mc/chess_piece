package ru.netcraker.chesspieces;

import ru.netcraker.chesspieces.base.Figure;
import ru.netcraker.service.MovesService;

import java.util.ArrayList;
import java.util.List;

import static ru.netcraker.utility.Utility.ONE_STEP_FURTHER;

public class Pawn extends Figure {

    public Pawn() {
    }

    public Pawn(char row, int column) {
        super(row, column);
    }

    @Override
    public List<String> getPossibleMoves() {
        return new ArrayList<>(movesService.getForwardMovesFrom(row, column, ONE_STEP_FURTHER));
    }
}
