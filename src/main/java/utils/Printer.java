package utils;

import racingcar.Car;
import racingcar.CarList;

public class Printer {
    public static final String CAR_NAME_INPUT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String RACE_ROUND_INPUT = "시도할 회수는 몇회인가요?";
    private static final String FINAL_WINNER = "최종 우승자: ";
    private static final String NEW_LINE = "\n";

    public static void setCarPrint() {
        System.out.println(CAR_NAME_INPUT);
    }

    public static void setPlayRoundPrint() {
        System.out.println(RACE_ROUND_INPUT);
    }

    public static void carRacingResultPrint(CarList carList) {
        StringBuilder result = new StringBuilder();

        for (Car car : carList.getCarList()) {
            result.append(car.getName() + " : ");
            for (int i = 0; i < car.getPosition(); i++) {
                result.append("-");
            }
            result.append(NEW_LINE);
        }
        System.out.println(result.toString());
    }

    public static void carRaceWinnerPrint(String winners) {
        System.out.println(FINAL_WINNER + winners);
    }
}
