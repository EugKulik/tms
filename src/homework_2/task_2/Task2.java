package homework_2.task_2;
//Task 2
//        Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//        сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class Task2 {
    public static void main(String[] args) {
        int aneba = 1;
        int delPart = 2;

        // 24 - в переменную, 3 - тоже в переменную
        for (int i = 0; i < 24; i += 3) {
            aneba *= 2;
        }
        System.out.println(aneba);
    }
}
