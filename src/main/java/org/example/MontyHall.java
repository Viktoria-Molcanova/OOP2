package org.example;

import java.util.Random;

public abstract class MontyHall {

    private static Random random = new Random();

    public static void main(String[] args) {
        int wins = 0;

        for (int i = 0; i < 1000; i++) {
            int carPosition = random.nextInt(3);  // случайная позиция для автомобиля
            int playerChoice = random.nextInt(3);  // игрок делает первый выбор

            int hostOpen = findGoatDoorToOpen(carPosition, playerChoice);  // ведущий открывает дверь с козой
            int playerSwitch = switchDoor(playerChoice, hostOpen);  // игрок меняет дверь

            if (playerSwitch == carPosition) {
                wins++;  // если игрок выбрал дверь с автомобилем после изменения выбора, увеличиваем счет побед
            }
        }

        System.out.println("Побед: " + wins);
    }

    // Метод для нахождения двери с козой, которую может открыть ведущий
    private static int findGoatDoorToOpen(int carPosition, int playerChoice) {
        int hostOpen;
        do {
            hostOpen = random.nextInt(3);
        } while (hostOpen == carPosition || hostOpen == playerChoice);
        return hostOpen;
    }

    // Метод для смены выбора двери игроком
    private static int switchDoor(int playerChoice, int hostOpen) {
        int playerSwitch;
        do {
            playerSwitch = random.nextInt(3);
        } while (playerSwitch == playerChoice || playerSwitch == hostOpen);
        return playerSwitch;
    }
}
