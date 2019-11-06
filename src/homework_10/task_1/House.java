package homework_10.task_1;

/*Создать обобщенный (generic) класс, который в конструкторе принимает аргумент неизвестного типа. Создайте  в классе метод,
который бы выводил что это за тип на экран (получить имя класса для переменной getClass().getName())*/
public class House<A, B> {
    private A street;
    private B number;

    public House(A street, B number) {
        this.street = street;
        this.number = number;
    }

    public A getStreet() {
        return street;
    }

    public B getNumber() {
        return number;
    }
}

