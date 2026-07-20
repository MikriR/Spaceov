package br.com.system;

import br.com.letters.Message;
import br.com.letters.Questions;
import br.com.several.Ship;

public class GameHeart {

    Ship playerShip = new Ship();

    public void initialCheck() {
        int choiceStart = Message.initialMessage();

        while (true) {
            if (choiceStart == 2) {
                choiceStart = Message.funMessage();
            } else if (choiceStart == 1) {
                Message.asksAndShipOrbit();
                return;
            } else {
                choiceStart = Message.validsOptions();
            }
        }
    }

    public void gameStart() {
        String choiceQuestion = Message.exhibitQuestion(0);
        boolean process = true;
        while (process) {
            if (choiceQuestion.equalsIgnoreCase(Questions.getGameAlternatives().get(1))) {
                Message.exhibitHitAndMiss(0);
                playerShip.integrityMore();
                Message.timing();
                process = false;

            } else {
                playerShip.integrityLoss();
                Message.noRepeatQuestion();

                choiceQuestion = Message.exhibitQuestion(0);
            }
        }
        Message.gasBallMessage();
        choiceQuestion = Message.exhibitQuestion(1);

        while (true) {
            if (choiceQuestion.equalsIgnoreCase(Questions.getGameAlternatives().getFirst())) {
                playerShip.integrityMore();
                Message.notYet();

                Message.exhibitHitAndMiss(3);
                Message.exhibitHitAndMiss(4);
                Message.shipController();
                return;

            } else {
                playerShip.integrityLoss();
                Message.noRepeatQuestionFinal();

                choiceQuestion = Message.exhibitQuestion(1);
            }
        }
    }

    public void countDownAndSunDetails() {
        String permissionChoice = Message.countDownPermission();

        while (true) {
            if (permissionChoice.equalsIgnoreCase(Message.yesChoice())) {
                Message.countDown();
                Message.toSun();
                Message.sunDescription();
                return;

            } else {
                permissionChoice = Message.responseNoAccept();
            }
        }
    }
}
