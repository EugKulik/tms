package homework_16.task_2;

public class Iteration implements Runnable {
    final int maxIterNum = 20;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= maxIterNum; i++) {
            System.out.println(name + " " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

