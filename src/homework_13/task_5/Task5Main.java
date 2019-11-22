package homework_13.task_5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*Task 5 (limit, reduce)
Есть коллекция чисел, найти произведение первых 5ти элементов*/
public class Task5Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6);
        long limit = 5;
        Optional<Integer> reduce = integerList.stream()
                .limit(limit)
                .reduce((x, y) -> x * y);
        System.out.println(reduce);
    }
}
