package homework_13.task_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/*Task 4 (filter + findFirst)
Есть коллекция чисел, найти первое, которое будет больше 22.
*/
public class Task4Main {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(19, 23, 4, 5, 6, 78);
        int findValue = 22;
        Optional<Integer> first = numberList.stream()
                .filter(number -> number > findValue)
                .findFirst();
        // не стоит просто печатать Optional, данные стоит извлекать
        System.out.println(first);
    }
}
