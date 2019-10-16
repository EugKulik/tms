package homework_3.task_4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int sizeTable = 10;
        int[][] multiplyTable = new int[sizeTable][sizeTable];
        for (int j = 0; j < multiplyTable.length; j++) {
            for (int i = 0; i < multiplyTable.length; i++) {
                multiplyTable[j][i] = (i + 1) * (j + 1);
                System.out.print(multiplyTable[j][i] + " ");
            }
            System.out.println();
        }
    }
}
