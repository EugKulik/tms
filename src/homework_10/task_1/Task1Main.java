package homework_10.task_1;

/*Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())*/
public class Task1Main {
    public static void main(String[] args) {
        House<String, Integer> house1 = new House<>("street", 3);
        String street = house1.getStreet();
        System.out.println(street.getClass().getName());
        printType(house1);
    }

    private static void printType(House<String, Integer> house1) {
        Integer number = house1.getNumber();
        System.out.println(number.getClass().getName());
    }
}
