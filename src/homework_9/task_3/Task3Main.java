package homework_9.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static homework_9.task_2.Task2Main.FILE_PATH;

/*Прочитать файл из Task_2 и вывести на экран содержимое*/
public class Task3Main {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH));
            String s;
            while ((s = bufferedReader.readLine())!= null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
