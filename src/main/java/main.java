import ru.netology.stats.StatsService;

public class main {

    public static void main(String[] args) {

        int[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        StatsService serviceSum = new StatsService();
        long sum = serviceSum.sum(sales);
        System.out.println("Сумму всех продаж = " + sum);

        StatsService serviceMedium = new StatsService();
        int medium = serviceMedium.medium(sales);
        System.out.println("Среднюю сумму продаж в месяц = " + medium);

        StatsService servicePeakMonth = new StatsService();
        int peakMonth = servicePeakMonth.peakMonth(sales);
        System.out.println("Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму) = " + peakMonth);
    }

}
