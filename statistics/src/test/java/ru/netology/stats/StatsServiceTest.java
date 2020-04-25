package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    private long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum() {
        StatsService service = new StatsService ();
        long expected = 180;
        long actual = service.calculateSum ( sales );
        assertEquals ( expected, actual );
    }

    @Test
    void calculateAverage() {
        StatsService service = new StatsService ();
        long expected = 15;
        long actual = service.calculateAverage ( sales );
        assertEquals ( expected, actual );
    }

    @Test
    void findMaxMonthNumber() {
        StatsService service = new StatsService ();
        long expected = 8;
        long actual = service.findMaxMonthNumber ( sales );
        assertEquals ( expected, actual );
    }

    @Test
    void findMinMonthNumber() {
        StatsService service = new StatsService ();
        long expected = 9;
        long actual = service.findMinMonthNumber ( sales );
        assertEquals ( expected, actual );
    }

    @Test
    void calculateMonthsBelowAverage() {
        StatsService service = new StatsService ();
        long expected = 5;
        long actual = service.calculateMonthsBelowAverage ( sales );
        assertEquals ( expected, actual );
    }

    @Test
    void calculateMonthsAboveAverage() {
        StatsService service = new StatsService ();
        long expected = 5;
        long actual = service.calculateMonthsAboveAverage ( sales );
        assertEquals ( expected, actual );
    }

}


