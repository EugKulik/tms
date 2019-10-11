package homework_2.task4;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

 */

// имя пакета task_4
public class Task4 {
    public static void main(String[] args) {
        int a = -3; // плохое название переменной
        int b = 0; // плохое название переменной
        int result = 0;

        // как-то очень усложнил, обычное сложение здесь
        if ((a > 0 & b > 0) | (a < 0 & b < 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);
            }
        } else if ((a > 0 & b < 0) | (a < 0 & b > 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);
            // пустая строка не нужна
            }
            result *= -1;
        } else {
            System.out.println("multiplication by zero");
        }

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("A x B = " + result);
    }
}
