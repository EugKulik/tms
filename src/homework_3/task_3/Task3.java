package homework_3.task_3;

import java.util.Arrays;

// форматируй код
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
