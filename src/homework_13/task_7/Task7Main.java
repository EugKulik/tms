package homework_13.task_7;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/*Есть коллекция телефонов. Найти телефон с наименьшей ценой*/
public class Task7Main {
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
        Optional<Phone> minPrice = phones.stream().min(Comparator.comparing(phone -> phone.getPrice()));
        System.out.println(minPrice.get());

    }
}
