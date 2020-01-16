package homework_20.task_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        String word = null;
        boolean iterloop = true;

        while (iterloop) {
            System.out.println("введите слово");
            System.out.println("n - exsit");
            word = scanner.next();
            if (!"no".equalsIgnoreCase(word)) {
                words.add(word);
            } else {
                iterloop = false;
            }
        }
        for (int i = 0; i < words.size(); i++) {
            char[] chars = words.get(i).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (!characterIntegerMap.containsKey(chars[j])) {
                    characterIntegerMap.put(chars[j], 1);
                } else characterIntegerMap.put(chars[j], characterIntegerMap.get(chars[j]) + 1);
            }
        }

        characterIntegerMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }
}

