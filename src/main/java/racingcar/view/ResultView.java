package racingcar.view;

import racingcar.domain.Car;
import racingcar.controller.WinnerPicker;
import java.util.List;

public class ResultView {
    public void printWinner(List<Car> cars){
        String winners = WinnerPicker.getWinner(cars);
        System.out.println("최종 우승자: " + winners);
    }

    public void printCars(List<Car> cars){
        for (Car car : cars) {
            car.go();
            car.print();
        }
        System.out.println();
    }
}
