package homework_17.task_2;

import java.util.Arrays;
import java.util.List;

/*Есть коллекция чисел. Используя stream API посчитать среднее*/
public class Task2Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4);
        double asDouble = integers.stream()
                .mapToInt(value -> value)
                .average()
                .getAsDouble();
        System.out.println(asDouble);
    }
}
