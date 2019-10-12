package homework_3.task_6;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arrayTask = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayInt = new int[arrayTask.length];
        int count = 0;

        for (int i = 0; i < arrayTask.length; i++) {
            if (arrayTask[i] % 2 == 0) {
                arrayInt[count] = arrayTask[i];
                count++;
            }
        }

        int[] arrayResult = Arrays.copyOf(arrayInt, count );
        System.out.println(Arrays.toString(arrayResult));
    }
}
