package homework_16.task_2;

public class Task2Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable iteration = new Iteration();
        Thread thread = new Thread(iteration);
        iteration.run(); // метод run() вызовется автоматически после метода start()
        thread.start();
        thread.join();
        System.out.format("End of %s",Thread.currentThread().getName());
    }
}
