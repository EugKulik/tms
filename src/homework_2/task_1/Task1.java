package homework_2.task_1;

// +
public class Task1 {
    public static void main(String[] args) {
        float distance = 10;
        int days = 7;

        for (int i = 0; i < days; i++) {
            distance = distance + distance / 10;
        }
        System.out.println("Cуммарный путь спортсмена за семь дней " + distance);
    }
}

