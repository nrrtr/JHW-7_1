package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxWithAnotherMaxNumbersPlace() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 17, 20, 50, 74, 30, 208, 76, 76, 50, 1};
        long expected = 208;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}