package homework_15.task_3;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework_15.entity.Student;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static homework_15.task_2.Task2Main.getListStudents;


public class Task3Main {

    public static void main(String[] args) throws IOException {
        String pathName = "resources/hw_15/xml/task2";
        String outPathName = "resources/hw_15/xml/task3/out";
        List<Student> students = getListStudents(pathName);
        List<Student> sortedStudentList = sortStudentList(students);
        fileWriter(sortedStudentList,outPathName);



    }

    private static List<Student> sortStudentList(List<Student> students) {
        List<Student> sortedStudentList = students.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(Collectors.toList());
        return sortedStudentList;
    }

    private static void fileWriter(List<Student> e, String path) throws IOException {
        File listStudent = new File(path);
        try (FileOutputStream fos = new FileOutputStream(path);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(e);
            oos.flush();
        }

    }
}
