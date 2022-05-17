package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StatsServiceTest {

    @ParameterizedTest
    @CsvSource()
    public void test(int[] sales, int expected) {
        StatsService serviceSum = new StatsService():

        int actual = serviceSum.sum(int[] sales);
    }

}
