import ru.netology.stats.StatsService;

public class main {

    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService serviceSum = new StatsService();
        long sum = serviceSum.sum(sales);
        System.out.println("Сумму всех продаж = " + sum);

        StatsService serviceMedium = new StatsService();
        int medium = serviceMedium.medium(sales);
        System.out.println("Среднюю сумму продаж в месяц = " + medium);

        StatsService servicePeakSales = new StatsService();
        int peakSales = servicePeakSales.peakSales(sales);
        System.out.println("Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму) = " + peakSales);

        StatsService servicePeakMonth = new StatsService();
        int peakMonth = servicePeakMonth.peakMonth(sales);
        System.out.println("Номер месяца, в котором был пик продаж (альтернативный вариант расчета) = " + peakMonth);

        StatsService serviceMinSales = new StatsService();
        int minSales = serviceMinSales.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму) = " + minSales);

        StatsService serviceMinMonth = new StatsService();
        int minMonth = serviceMinMonth.minMonth(sales);
        System.out.println("Номер месяца, в котором был минимум продаж (альтернативный вариант расчета) = " + minMonth);

        StatsService serviceLessThanMedium = new StatsService();
        int lessThanMedium = serviceLessThanMedium.lessThanMedium(sales);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего = " + lessThanMedium);

        StatsService serviceAboveMedium = new StatsService();
        int aboveMedium = serviceAboveMedium.aboveMedium(sales);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего = " + aboveMedium);

    }

}
