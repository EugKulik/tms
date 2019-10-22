package homework_4.task_1;

import java.lang.reflect.Array;
import java.util.Objects;

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
public class Human {
    private static String text = "Hello from static"; // static переменные идут первыми в классе
    private String name;
    private int age;

    // конструктор без аргументов должен идти раньше других
    public Human() {
        this("Noname", 20);
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void show() {
        System.out.println("Name human " + getName() + " his age " + getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    static int countEqualsHuman(Human[] array, Human o) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                count++;
            }
        }
        return count;
    }

    public void setText(String text) {
        Human.text = text;
    }

    void printText() {
        System.out.println(text);
    }
}
