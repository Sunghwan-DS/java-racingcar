package racingcar;

import java.util.List;

public class RacingGameRunner {

    public static void main(String[] args) {
        RacingGameOption option = InputView.inputRacingGameOption();

        RacingGame racingGame = new RacingGame(option);
        List<RacingGameResultSet> resultSets = racingGame.start();

        ResultView.showRacingGameResultSet(resultSets);
    }
}
