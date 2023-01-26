public class Main {
    public static void main(String[] args) {
        int initialBalance = 500;
        int replenishment = 1200;
        int bonus = replenishment > 1000 ? replenishment / 100 : 0;
        int finalBalance = initialBalance + replenishment + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}