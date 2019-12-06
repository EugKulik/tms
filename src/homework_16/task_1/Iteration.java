package homework_16.task_1;

public class Iteration implements Runnable {
    final static int MAX_ITER_NUM = 10; // 10 лучше через конструктор

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= MAX_ITER_NUM; i++) {
            System.out.println(name + " " + i);
        }
    }
}
