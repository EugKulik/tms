package homework_13.task_10;

import homework_13.entity.Phone;

import java.util.ArrayList;
import java.util.List;

/*Task 10
Есть коллекция телефонов, сделать из нее мапу, в которой ключ - это производитель, а вэлью - это кол-во телефонов этого
производителя в исходной коллекции
*/
public class Task10Main {
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


    }
}
