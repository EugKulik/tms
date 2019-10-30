package homework_7.task_8;

/*Есть склад авто и выяснилось, что всем присвоили неверные маркировки двигателя.
Необходимо все 1.4 литра двигатели заменить на 2.0Т, а все 1.8, на 1.8Т.*/

public class Task8Main {
    public static void main(String[] args) {
        Car car1 = new Car(MarkerEngine.MARKER1_4L);
        Car car2 = new Car(MarkerEngine.MARKER1_8L);
        System.out.println(car1.getMarkerEngine());
        // это делать через рефлекцию?
        // рефлекция -> рефлексия
        
        /*
        создаешь массив авто
        бежишь по массиву и проверяешь двигатель, если попадает под if(), значит сетаешь новое значение
        */
    }
}


