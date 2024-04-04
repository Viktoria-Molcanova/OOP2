package Homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


@Test
public void testFindGoatDoorToOpen_Negative() {
    int carPosition = 0;
    int playerChoice = 1;
    int hostOpen = MontyHall.findGoatDoorToOpen(carPosition, playerChoice);
    assertNotEquals(playerChoice, hostOpen);
    assertNotEquals(carPosition, hostOpen);
}

@Test
public void testSwitchDoor_Negative() {
    int playerChoice = 1;
    int hostOpen = 0;
    int playerSwitch = MontyHall.switchDoor(playerChoice, hostOpen);
    assertNotEquals(playerChoice, playerSwitch);
    assertNotEquals(hostOpen, playerSwitch);
}
@Test
public void testSwitchDoor() {
    int playerChoice = 0;
    int hostOpen = 1;
    int switchedDoor = MontyHall.switchDoor(playerChoice, hostOpen);
    assertNotEquals(playerChoice, switchedDoor);
    assertNotEquals(hostOpen, switchedDoor);
}

@Test
public void testFindGoatDoorToOpen() {
    int carPosition = 2;
    int playerChoice = 1;
    int goatDoor = MontyHall.findGoatDoorToOpen(carPosition, playerChoice);
    assertNotEquals(carPosition, goatDoor);
    assertNotEquals(playerChoice, goatDoor);
}

