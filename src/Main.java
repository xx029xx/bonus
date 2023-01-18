public class Main {
    public static void main(String[] args) {
        int initialBalance = 500;
        int replenishment1 = 1200;
        int replenishment2 = 300;
        int bonus1 = replenishment1 > 1000 ? replenishment1 / 100 : 0;
        int bonus2 = replenishment2 > 1000 ? replenishment2 / 100 : 0;
        int finalBalance = initialBalance + replenishment1 + bonus1;
        int finalBalance2 = initialBalance + replenishment2 + bonus2;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus1);

        System.out.println("Итоговый счет: " + finalBalance2);
        System.out.println("Бонус: " + bonus2);
    }
}