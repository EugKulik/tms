package homework_9.task_7;

import java.io.IOException;
import java.nio.file.*;

//Написать функцию, которая бы обходила весь каталог (включая вложенные папки и  файлы) и печатала бы на экран структуру
public class Task7Main {
    public static void main(String[] args) {
       try (DirectoryStream<Path> src = Files.newDirectoryStream(Paths.get("src"))){
           // а если будут папки внутри папок, код будет работать корректно?
           for (Path path : src) {
               System.out.println(path);
           }
    } catch (IOException e) {
           e.printStackTrace();
       }
    }
}

