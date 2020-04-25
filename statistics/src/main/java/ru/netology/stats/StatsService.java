package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public long findMaxMonthNumber(long[] sales) {
        long currentMax = -1;
        long maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (currentMax <= sales[i]) {
                currentMax = sales[i];
                maxMonth = i+1;
            }
        }
        return maxMonth;
    }

    public long findMinMonthNumber(long[] sales) {
        long currentMin = sales[0];
        long minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if ( sales[i] <= currentMin ) {
                currentMin = sales[i];
                minMonth = i+1;
            }
        }
        return minMonth;
    }

    public long calculateMonthsBelowAverage(long[] sales) {
        long monthesBelow = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (sale < average) {
                monthesBelow += 1;
            }
        }
        return monthesBelow;
    }

    public long calculateMonthsAboveAverage(long[] sales) {
        long monthesAbove = 0;
        long average = calculateAverage ( sales );
        for (long sale : sales) {
            if (sale > average) {
                monthesAbove += 1;
            }
        }
        return monthesAbove;
    }

}


