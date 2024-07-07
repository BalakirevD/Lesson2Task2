//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int finalAmount;
        int limit = 1000;
        int bonus = 0;

        int startAmount = 500; //начальная сумма
        int addAmount = 1200; //сумма вложения

        if (addAmount >= limit) {
            bonus = addAmount / 100;
        }

        finalAmount = startAmount + addAmount + bonus;
        System.out.println(finalAmount);
    }
}