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
        long sum = sum(sales);
        int amount = sales.length;
        int medium = (int) (sum / amount);
        return medium;
    }

    public int peakSales(int[] sales) {
        int peakMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[peakMonth]) {
                peakMonth = month;
            }
            month = month + 1;
        }
        return peakMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanMedium(int[] sales) {
        int medium = medium(sales);
        int lessThanMedium = 0;
        for (int sale : sales) {
            if (sale < medium) {
                lessThanMedium++;
            }
        }
        return lessThanMedium;
    }

    public int aboveMedium(int[] sales) {
        int medium = medium(sales);
        int aboveMedium = 0;
        for (int sale : sales) {
            if (sale > medium) {
                aboveMedium++;
            }
        }
        return aboveMedium;
    }
}
