package homework_3.task_2;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 8};

        averageArray(array);
    }

    // метод должен выпонять 1 действие, т.е. этот считает сумму и возвращает число, печатаем уже в методе main
    private static void averageArray(int[] array) {
        double sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println(sum / array.length);
    }
}

