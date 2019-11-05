package homework_9.task_4;

import java.io.Serializable;

/*Создайте класс Employee, Work. У Work есть атрибуты название и минимальный стаж.
У Employee есть имя, возраст и работа (work).
Запишите объект Employee в файл, затем восстановите его обратно в объект.
*/
public class Work implements Serializable {
    private String title;
    private int minExperience;

    public Work(String title, int experience) {
        this.title = title;
        this.minExperience = experience;
    }

    @Override
    public String toString() {
        return "Work{" +
                "title='" + title + '\'' +
                ", minExperience=" + minExperience +
                '}';
    }
}
