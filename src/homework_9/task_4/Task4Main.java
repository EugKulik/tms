package homework_9.task_4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/*Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
У Employee есть имя, возраст и работа (work).
Запишите объект Employee в файл, затем восстановите его обратно в объект.
*/
public class Task4Main {
    public static final String FILE_NAME = "src/homework_9/task_4/Object";

    public static void main(String[] args) {
        Employee engineer = new Employee("Mike", 30, new Work("engineer", 3));
        writeEmployee(engineer, FILE_NAME);

        readEmployee(FILE_NAME);
    }

    public static void readEmployee(String path) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(path)))) {
            Employee employee =(Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void writeEmployee(Employee engineer, String path) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
            objectOutputStream.writeObject(engineer);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
