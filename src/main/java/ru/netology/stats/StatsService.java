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

    //Альтернативный вариант расчета
    public int peakMonth(int[] sales) {
        int max = sales[0];
        int peakMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= max) {
                max = sales[i];
                peakMonth = i + 1;
            }
        }
        return peakMonth;
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

    //Альтернативный метод расчета
    public int minMonth(int[] sales) {
        int min = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= min) {
                min = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int lessThanMedium(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int amount = sales.length;
        int medium = (int) (sum / amount);

        int lessThanMedium = 0;
        for (int sale : sales) {
            if (sale < medium) {
                lessThanMedium++;
            }
        }
        return lessThanMedium;
    }

    public int aboveMedium(int[] sales) {
        long sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int amount = sales.length;
        int medium = (int) (sum / amount);

        int aboveMedium = 0;
        for (int sale : sales) {
            if (sale > medium) {
                aboveMedium++;
            }
        }
        return aboveMedium;
    }
}
