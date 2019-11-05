package homework_9.task_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

//Есть массив чисел, заполнить его можете любыми цифрами. Нужно записать его в файл
public class Task1Main {
    public static final String FILE_PATH = "src/homework_9/task_1/Int array file";

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bufferedWriter.write(Arrays.toString(array));
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println("we have problems with availability file");
        }
    }
}
