package homework_17.task_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*Используя ReentrantLock написать программу, котоорая бы добавляла новые элементы в лист в многопоточном режиме*/
public class Task1Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        Runnable runnable = () -> {
            int iterNum = 500000;
            for (int i = 0; i < iterNum; i++) {
                warehouse.fell(String.valueOf(i));
            }
        };
        Thread thread = new Thread(runnable);
        Thread secondThread = new Thread(runnable);

        thread.start();
        secondThread.start();

        try {
            thread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(warehouse.getRack().size());
    }
}
