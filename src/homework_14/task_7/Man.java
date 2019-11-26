package homework_14.task_7;

/*Сделать класс Man у которого 3 поля - имя, фамилия, тел.номер.
Сделать конструкторы:
1. с параметрами имя тел. номер,
2. с параметрами имя, фамилия тел. номер.
3. с параметрами имя, фамилия.
Конструктора без параметров быть не должно. Избежать дублирования кода
*/
public class Man {
    private String name;
    private String surname;
    private int telNumber;

    public Man(String name, int telNumber) {
        this.name = name;
        this.telNumber = telNumber;
    }

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Man(String name, String surname, int telNumber) {
        this(name, surname);
        this.telNumber = telNumber;
    }
}
