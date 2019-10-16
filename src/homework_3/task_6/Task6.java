package homework_3.task_6;

import java.util.Arrays;

// форматируй код
public class Task6 {
    public static void main(String[] args) {
        int[] evenArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayInt = new int[evenArray.length];
        int count = 0;

        for (int i = 0; i < evenArray.length; i++) {
            if (evenArray[i] % 2 == 0) {
                arrayInt[count] = evenArray[i];
                count++;
            }
        }

        int[] arrayResult = Arrays.copyOf(arrayInt, count);
        System.out.println(Arrays.toString(arrayResult));
    }
}
