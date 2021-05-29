package ru.netology.stats;

public class StatsService<number, returne> {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long calculateAverageSum(long[] sales) {
       long average = 0;
            long sum = calculateSum(sales);
            average = sum / sales.length;
            return average;
        }
        

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long belowAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
    public long upAverage(long[] sales) {
        long average = calculateAverageSum(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
    }
