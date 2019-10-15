package homework_3.task_4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int sizeTable = 10;
        // any - так себе название для таблицы умножения
        int[][] any = new int[sizeTable][sizeTable];
        for (int j = 0; j < any.length; j++) {
            for (int i = 0; i < any.length; i++) {
                any[j][i] = (i + 1) * (j + 1);
                System.out.print(any[j][i] + " ");
            }
            System.out.println();
        }
    }
}
