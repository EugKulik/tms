package homework_15.task_3;

import homework_15.entity.Student;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static homework_15.task_2.Task2Main.getListStudents;


public class Task3Main {

    public static void main(String[] args) throws IOException {
        String pathname = "resources/hw_15/xml/task2";
        List<Student> students = getListStudents(pathname);
        List<Student> sortedStudentList = students.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println(sortedStudentList);
    }
}
