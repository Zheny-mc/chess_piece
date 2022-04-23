package ru.netcraker.chesspieces;

import ru.netcraker.chesspieces.base.Figure;
import ru.netcraker.service.MovesService;

import java.util.ArrayList;
import java.util.List;

import static ru.netcraker.utility.Utility.ONE_STEP_FURTHER;

public class King extends Figure {

    public King() {
    }

    public King(char row, int column) {
        super(row, column);
    }

    @Override
    public List<String> getPossibleMoves() {

        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.addAll(movesService.getForwardMovesFrom(row, column , ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getDiagonalForwardRightMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getRightMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getDiagonalBackwardRightMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getBackwardMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getDiagonalBackwardLeftMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getLeftMovesFrom(row, column, ONE_STEP_FURTHER));
        possibleMoves.addAll(movesService.getDiagonalForwardLeftMovesFrom(row, column, ONE_STEP_FURTHER));
        return possibleMoves;
    }
}
