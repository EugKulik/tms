package homework_16.task_2;

public class Iteration implements Runnable {
    final static int MAX_ITER_NUM = 20;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= MAX_ITER_NUM; i++) {
            System.out.println(name + " " + i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

