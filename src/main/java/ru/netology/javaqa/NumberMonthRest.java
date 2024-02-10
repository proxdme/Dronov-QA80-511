package ru.netology.javaqa;

public class NumberMonthRest {

    public int calcNumderMonthRest(int income, int expenses, int threshold) {
        int account = 0; // деньги на счету начало
        int NumberMonthsRests = 0; // есть ли возможность отдохнуть

        for (int month = 1; month <= 12; month++) {
            if (account >= threshold) {
                NumberMonthsRests++;
                account = (account - expenses) / 3;
                ; // учитываем затраты на отдых;
                System.out.println("Месяц" + month + " Денег " + account + " Буду отдыхать. Потратил - " + expenses + " , затем ещё - " + (account - expenses));
            } else {
                account = account + income - expenses;
                System.out.println("Месяц " + month + " Денег " + account + " Придётся работать. Заработал + " + income + ", потратил - " + expenses);
            }
        }
        return NumberMonthsRests;
    }
}
