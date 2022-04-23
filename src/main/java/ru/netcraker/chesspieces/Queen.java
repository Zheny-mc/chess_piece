package ru.netcraker.chesspieces;

import ru.netcraker.chesspieces.base.Figure;
import ru.netcraker.service.MovesService;

import java.util.ArrayList;
import java.util.List;

import static ru.netcraker.utility.Utility.ACROSS_THE_BOARD;

public class Queen extends Figure {

    public Queen() {
    }

    public Queen(char row, int column) {
        super(row, column);
    }

    @Override
    public List<String> getPossibleMoves() {
        List<String> possibleMoves = new ArrayList<>();
        possibleMoves.addAll(movesService.getForwardMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getDiagonalForwardRightMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getRightMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getDiagonalBackwardRightMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getBackwardMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getDiagonalBackwardLeftMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getLeftMovesFrom(row, column, ACROSS_THE_BOARD));
        possibleMoves.addAll(movesService.getDiagonalForwardLeftMovesFrom(row, column, ACROSS_THE_BOARD));
        return possibleMoves;
    }
}
