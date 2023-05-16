package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldShowHowMuchNeedForBonusUnderBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowThatEnoughForBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowHowMuchBuyForBonusUpperBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }
}