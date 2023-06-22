package ru.netology.services;

public class HolidayService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int mounth = 0; mounth < 12; mounth++) {
            if (money >= threshold) {
                money = (money - expenses);
                money = money/3;
                count++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return count;
    }
}
