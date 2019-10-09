package homework_2.task4;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

 */
public class Task4 {
    public static void main(String[] args) {
        int a = -3;
        int b = 0;
        int result = 0;


        if ((a > 0 & b > 0) | (a < 0 & b < 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);
            }
        } else if ((a > 0 & b < 0) | (a < 0 & b > 0)) {
            for (int i = 1; i <= Math.abs(b); i++) {
                result += Math.abs(a);

            }
            result *= -1;
        } else {
            System.out.println("multiplication by zero");
        }

        System.out.println("A = " + a + ", B = " + b);
        System.out.println("A x B = " + result);
    }
}
