package homework_13.task_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*Task 2 (max, String::compareTo / Comparator.naturalOrder())
Есть коллекция строк, нужно найти строку с максимальной длинной.*/
public class Task2Main {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("pineapple");
        fruitsList.add("mango");
        fruitsList.add("mango");
        fruitsList.add("pear");
        fruitsList.add("sugar apple");

        // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        Optional<String> min = fruitsList.stream().min(Comparator.comparing(String::length));
        System.out.println(min.get());
        
        // а если в коллекция будет пустой? будет исключение, когда ты вызовешь метод get(), добавь проверку
        Optional<String> max = fruitsList.stream().max(Comparator.comparing(String::length));
        System.out.println(max.get());
    }
}
