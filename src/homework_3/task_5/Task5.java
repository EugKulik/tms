package homework_3.task_5;

import java.util.Arrays;

// +
public class Task5 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};

        for (int i = 0; i < array.length / 2; i++) {
            int swapValue = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = swapValue;
        }

        System.out.println(Arrays.toString(array));
    }
}
