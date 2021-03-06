package homework_9.task_6;

import java.io.*;

/*Секретный файл. Скачайте любую картинку и запишите в нее секретное сообщение, не забудьте поставить append flag в значение true.
Затем это сообщение нужно прочитать из файла и вывести на экран*/
public class Task6Main {
    public static final String FILE_PATH = "src/homework_9/task_6/145458292112119207.jpg";

    public static void main(String[] args) {
        // чтение и запись в файл в отдельный метод
        
        // когда записывал в файл, стоило запомнить с какого байта начинается твое сообщение, чтобы потом прочимтать его
            // + кол-во байт в сообщение, чтобы знать сколько байт прочитать
    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH,true))) {
        String secretMessage = "This is a secret message";
        bufferedWriter.write(secretMessage);
        bufferedWriter.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))){
        String s;
         // таким образом ты читаешь весь файл, а нужно было только часть с секретным сообщением
        while ((s = bufferedReader.readLine() )!= null){
            System.out.println(s);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
