package homework_3.task_7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {7, 1, 0, -8};
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int min = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = min;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
