package ru.netology.stats;

public class StatsService {
    public long sum(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int medium(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int amount = sales.length;
        int medium = (int) (sum / amount);
        return medium;
    }

    public int peakMonth(int[] sales) {
        int max = sales[0];
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
                if (sales [i] >= max) {
                max = sales [i];
                peakMonth = i + 1;
                }
        }
        return peakMonth;
    }
}
