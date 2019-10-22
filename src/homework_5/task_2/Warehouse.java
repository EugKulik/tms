package homework_5.task_2;

import java.util.Arrays;

/*сделать класс Warehouse, внутри которого массив (массив чего придумайте сами). Массив  должен быть immutable
При создании объекта создается массив, заносятся в него данные, изменять или добавлять значения в массив после  этого  нельзя
в классе должен быть метод next() который возвращает следующий элемент массива.
Если дошли до последнего элемента при вызове next(), должно вернуть первый элемент
также должен быть метод getArray() - который возвращает массив и переопределен метод toString()*/
public class Warehouse {
    static int cont = 0;
    private final Rack[] rack;

    public Warehouse(Rack[] rack) {
        this.rack = rack;
    }

    public Rack next() {
        cont++;
        if ((rack.length > 0 & cont < rack.length)) {
            return rack[cont - 1];
        } else {
            return rack[(cont - 1) % rack.length];
        }
    }

    public Rack[] getArray() {
        Rack[] copy = Arrays.copyOf(rack, rack.length);
        return copy;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "rack=" + Arrays.toString(rack) +
                '}';
    }
}
