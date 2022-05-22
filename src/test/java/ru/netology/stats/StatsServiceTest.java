package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void serviceSumTest() {
        StatsService serviceSum = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = serviceSum.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void serviceMediumTest() {
        StatsService serviceMedium = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = serviceMedium.medium(sales);
        int expected = 15;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void servicePeakSalesTest() {
        StatsService servicePeakSales = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = servicePeakSales.peakSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void serviceMinSalesTest() {
        StatsService serviceMinSales = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = serviceMinSales.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void serviceLessThanMediumTest() {
        StatsService serviceLessThanMedium = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = serviceLessThanMedium.lessThanMedium(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void serviceAboveMediumTest() {
        StatsService serviceAboveMedium = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = serviceAboveMedium.aboveMedium(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

}
