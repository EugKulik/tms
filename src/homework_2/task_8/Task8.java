package homework_2.task_8;

public class Task8 {
    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;
        int countAll = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                countEven += i;
            }else {
                countOdd+=i;
            }
            countAll+=i; // общую сумму можно посчитать 1 раз после выхода из цикла
        }
        System.out.println("Sum all numbers = " + countAll);
        System.out.println("Sum even numbers = " + countEven);
        System.out.println("Sum odd numbers = " + countOdd);
    }
}
