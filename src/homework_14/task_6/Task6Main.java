package homework_14.task_6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Task 6
Есть два отсортированных массива, необходимо самым оптимальным способом сделать из них один и тоже отсортированный
[1,4,5]
[0,2,3,6]
Результат: [0,1,2,3,4,5]*/
public class Task6Main {
    public static void main(String[] args) {
        int[] firstArray = {1, 4, 5};
        int[] secondArray = {0, 2, 3, 6};
        // это не оптимальное решение, ты теряешь преимущество того, что массивы изначально отсортированы
        int[] sum = IntStream.concat(Arrays.stream(firstArray), Arrays.stream(secondArray))
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(sum));
    }
}

