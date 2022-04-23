package ru.netcraker.service;

import ru.netcraker.chesspieces.*;
import ru.netcraker.chesspieces.base.Figure;
import ru.netcraker.exception.ChessPieceException;
import ru.netcraker.utility.Utility;

import java.util.List;
import java.util.Map;

public class ApplicationService {
    private char currentRowPosition;
    private int currentColumnPosition;
    private final Map<String, Figure> figures = Map.of(
            "Bishop", new Bishop(),
            "King", new King(),
            "Queen", new Queen(),
            "Horse", new Horse(),
            "Rook", new Rook(),
            "Pawn", new Pawn()
            );


    public List<String> getMovesFor(String userInputString) {
        String[] input = userInputString.split(Utility.SPACE_SEPARATED_DELIMITER);
        String chessPiece = input[0];
        extractCurrentRowAndColumnPositionsFrom(input);
        List<String> availableMoves;

        if (figures.containsKey(chessPiece)) {
            Figure figure = figures.get(chessPiece);
            figure.setColumn(currentColumnPosition);
            figure.setRow(currentRowPosition);
            availableMoves = figure.getPossibleMoves();
        } else {
            throw new ChessPieceException("You entered an invalid piece. " +
                    "Please enter any piece from the following:" +
                    "King, Queen, Bishop, Rook, Horse, Pawn");
        }

        return availableMoves;
    }

    private void extractCurrentRowAndColumnPositionsFrom(String[] input) throws ChessPieceException {
        String currentPosition;
        try {
            currentPosition = input[1];
            Utility.validate(currentPosition);
            currentRowPosition = currentPosition.charAt(0);
            currentColumnPosition = Integer.parseInt(currentPosition.substring(1));
        } catch (Exception exception) {
            throw new ChessPieceException(exception.getMessage());
        }
    }
}