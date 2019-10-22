package homework_4.task_1;

import java.util.Arrays;

/*Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
У класса должен быть конструктор, который принимает в виде аргументов эти два поля и конструктор без аргументов,
который присваивает значения по умолчанию для имени и возраста. Добавьте методы, при помощи которых можно
получить имя и возраст. Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате

В отдельном классе в методе main() создать экземпляр этого класса и вывести на экран используя метод show()
Task 3
Создайте массив, состоящий из объектов класса из 'Task 1'. Найдите кол-во одинаковых объектов в массиве

Task 4
Классу из 'Task 1' добавьте статическое приватное поле text = "Hello from static". Создайте в этом же классе метод,
который бы выводил на экран это поле и метод, при помощи которого можно изменить значение этого поля.
В другом классе, с методом main создайте несколько экземпляров класса из 'Task 1'. В одном из них измените значение
поля 'text' и затем выведите на экран поле 'text' у всех созданных классов. Подумайте почему так.
*/

public class HumanMain {
    public static void main(String[] args) {

        // human1 -> noName
        Human noName = new Human();
        // human2 - alex
        Human alex = new Human("Alex", 28);
        noName.setText("hello from object1");
        int sizeArray = 5;

        Human arrayHuman[] = new Human[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            arrayHuman[i] = new Human("Noname", 16 + i);
        }

        noName.show();
        // countEqualsHuman() - такие методы все же лучше не делать в классе-сущности, т.е. не в Human
        System.out.println(Human.countEqualsHuman(arrayHuman, noName));
        noName.printText();
        alex.printText();
    }
}
