package homework_13.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Есть коллекция строк, нужно убрать все элементы, длина которых меньше 5 символов*/
public class Task1Main {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("pineapple");
        fruitsList.add("mango");
        fruitsList.add("mango");
        fruitsList.add("pear");
        fruitsList.add("sugar apple");

        int maxLenght = 5;
        List<String> collect = fruitsList.stream()
                .filter(s -> s.length() > maxLenght)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
