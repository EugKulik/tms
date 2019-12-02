package homework_16.task_1;

public class Iteration implements Runnable {
    final int maxIterNum = 10;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= maxIterNum; i++) {
            System.out.println(name + " " + i);
        }

    }
}
