package homework_6.task_1;

public class Task1 {
    /*
     Написать рекурсивную функцию, которая бы перебирала все элементы массива и выводила их на экран
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3};
        printArray(0, array);
    }

    private static void printArray(int index, int[] array) {
        if (index == array.length - 1) {
            System.out.println(array[index]);
            return;
        }
        System.out.println(array[index]);
        printArray(index + 1, array);
    }
}

