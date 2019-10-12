package homework_2.task_4;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.

 */

public class Task4 {
    public static void main(String[] args) {
        int mnojemoe = -3;
        int mnojetel = 2;
        int result = 0;

        if ((mnojemoe > 0 & mnojetel > 0) | (mnojemoe < 0 & mnojetel < 0)) {
            for (int i = 1; i <= Math.abs(mnojetel); i++) {
                result += Math.abs(mnojemoe);
            }
        } else if ((mnojemoe > 0 & mnojetel < 0) | (mnojemoe < 0 & mnojetel > 0)) {
            for (int i = 1; i <= Math.abs(mnojetel); i++) {
                result += Math.abs(mnojemoe);
            }
            result *= -1;
        } else {
            System.out.println("multiplication by zero");
        }

        System.out.println("A = " + mnojemoe + ", B = " + mnojetel);
        System.out.println("A x B = " + result);
    }
}
