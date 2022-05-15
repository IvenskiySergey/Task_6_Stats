package ru.netology.stats;

public class StatsServiceTest {

    public long sum(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


}
