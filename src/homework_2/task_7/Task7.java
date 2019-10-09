package homework_2.task_7;

public class Task7 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                count += i;
            }
        }
        System.out.println("sum odd numbers 1-99 equally " + count);
    }
}
