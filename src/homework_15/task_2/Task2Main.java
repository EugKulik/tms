package homework_15.task_2;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework_15.entity.Student;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*Есть студенты. Каждый студент записан в отдельном .json файле.
У каждого студента есть номер группы, имя, фамилия, факультет и список любимых предметов для изучения.
Прочитать студентов при помощи Jackson JSON парсера и добавить их в какой-нибудь лист.*/
public class Task2Main {

    public static void main(String[] args) throws IOException {
        String pathname = "resources/hw_15/xml/task2";

        System.out.println(getListStudents(pathname));
    }

    public static List<Student> getListStudents(String pathname) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Student> students = new ArrayList<>();
        File folder = new File(pathname);
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isFile()) {
                String entryName = entry.toString();
                Student student = mapper.readValue(new File(entryName), Student.class);
                students.add(student);
            }
        }
        return students;
    }
}