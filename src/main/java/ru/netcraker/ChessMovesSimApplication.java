package ru.netcraker;

import ru.netcraker.main_controller.ApplicationController;

public class ChessMovesSimApplication {

    public static void main(String[] args) {
        ApplicationController applicationController = new ApplicationController();
        applicationController.takeUserInput();
    }
}
