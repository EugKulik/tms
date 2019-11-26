package homework_14.task_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Task 3
Есть две HashMap<String, List<Integer>>, нужно сделать из них одну (смержить)*/
public class Task3Main {
    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(3);
        first.add(5);
        first.add(7);
        List<Integer> second = new ArrayList<>();
        second.add(0);
        second.add(2);
        second.add(4);
        second.add(7);

        Map<String, List<Integer>> stringListMap1 = new HashMap<>();
        stringListMap1.put("first", first);
        Map<String, List<Integer>> stringListMap2 = new HashMap<>();
        stringListMap2.put("second", second);
        Map<String, List<List<Integer>>> collect = Stream.concat(stringListMap1.entrySet().stream(), stringListMap2.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        System.out.println(collect);
    }
}