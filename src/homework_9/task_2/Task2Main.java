package homework_9.task_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Task 2
Есть некоторый текст, его нужно записать в файл. Можно использовать одно и тоже предложение, запишите его 10.000 раз*/
public class Task2Main {
    public static final String FILE_PATH = "src/homework_9/task_2/output text";

    public static void main(String[] args) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            // s -> переименуй
            String s = "input/output text \n";
            int iterNum = 10000;
            for (int i = 0; i < iterNum; i++) {
                bufferedWriter.write(s);
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            System.err.println("we have problems with availability file");
        }
    }
}
