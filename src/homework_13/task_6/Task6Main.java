package homework_13.task_6;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Task 6 (distinct)
Есть коллекция телефонов, нужно убрать все повторяющиеся*/
public class Task6Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Xs", "Apple", 1100));
        phones.add(new Phone("8", "Apple", 700));
        phones.add(new Phone("S10", "Samsung", 1100));
        phones.add(new Phone("S8", "Samsung", 400));
        phones.add(new Phone("Mi8", "Xiaomi", 350));
        phones.add(new Phone("MiMix", "Xiaomi", 500));
        phones.add(new Phone("3310", "Nokia", 100));
        phones.add(new Phone("P7", "Huawei", 100));
        phones.add(new Phone("P7", "Huawei", 100));
        List<Phone> collect = phones.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
