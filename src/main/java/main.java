import ru.netology.stats.StatsService;

public class main {

    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService serviceSum = new StatsService();
        long sum = serviceSum.sum(sales);
        System.out.println("1. Сумму всех продаж = " + sum);

        StatsService serviceMedium = new StatsService();
        int medium = serviceMedium.medium(sales);
        System.out.println("2. Среднюя сумма продаж в месяц = " + medium);

        StatsService servicePeakSales = new StatsService();
        int peakSales = servicePeakSales.peakSales(sales);
        System.out.println("3. Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму) = " + peakSales);

        StatsService serviceMinSales = new StatsService();
        int minSales = serviceMinSales.minSales(sales);
        System.out.println("4. Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму) = " + minSales);

        StatsService serviceLessThanMedium = new StatsService();
        int lessThanMedium = serviceLessThanMedium.lessThanMedium(sales);
        System.out.println("5. Кол-во месяцев, в которых продажи были ниже среднего = " + lessThanMedium);

        StatsService serviceAboveMedium = new StatsService();
        int aboveMedium = serviceAboveMedium.aboveMedium(sales);
        System.out.println("6. Кол-во месяцев, в которых продажи были выше среднего = " + aboveMedium);

    }

}
