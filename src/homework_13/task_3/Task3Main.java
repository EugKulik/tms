package homework_13.task_3;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Task 3 (map + filter)
Есть коллекция телефонов. Необходимо получить из нее коллекцию производителей (производитель - это строка) и оставить только те,
которые входят в список:
 Apple, Samsung, Xiaomi*/

// +
public class Task3Main {
    public static void main(String[] args) {
        List <String> searchProducer = Arrays.asList( "Apple", "Samsung", "Xiaomi");
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1100));
        phones.add(new Phone("8", "Apple", 700));
        phones.add(new Phone("S10", "Samsung", 1100));
        phones.add(new Phone("S8", "Samsung", 400));
        phones.add(new Phone("Mi8", "Xiaomi", 350));
        phones.add(new Phone("MiMix", "Xiaomi", 500));
        phones.add(new Phone("3310", "Nokia", 100));
        phones.add(new Phone("P7", "Huawei", 100));

        List<String> collect = phones.stream()
                .map(Phone::getProducer)
                .filter(searchProducer::contains)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
