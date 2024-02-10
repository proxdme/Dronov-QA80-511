package ru.netology.javaqa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NumberMonthRest service = new NumberMonthRest();

        int expected = 2;
        int actual = service.calcNumderMonthRest(100_000, 60_000, 150_000);
        System.out.println(" Реально:" + actual);
    }
}
