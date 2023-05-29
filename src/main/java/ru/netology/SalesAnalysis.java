package ru.netology;

public class SalesAnalysis {
    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму!!!
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int BelowAverage(int[] sales) {
        int summa = 15;
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < summa)
                monthMin = monthMin + 1;
        }
        return monthMin;
    }

    public int AboveAverage(int[] sales) {
        int summa = 15; // Среднее значение
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > summa)
                monthMax = monthMax + 1;
        }
        return monthMax;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                maxMonth = a; // запомним его как минимальный
            }
        }
        return maxMonth + 1;
    }

    public int AverageSalesAmount(int[] sales) {
        int summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = (summa + sales[i]);
        }
        return summa / 12;
    }

    public int summaSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }
}
