package homework_3.task_2;

public class Task2 {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 8};

        averageArray(array);
    }

    private static void averageArray(int[] array) {
        double sum = 0;

        for (int element : array) {
            sum += element;
        }

        System.out.println(sum / array.length);
    }
}

