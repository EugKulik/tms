package homework_16.task_1;

/*Task 1
Создать класс, который в цикле выводит на экран числа от 0-10, запустить его в отдельном потоке*/

// +
public class Task1Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable iteration = new Iteration();
        Thread thread = new Thread(iteration);
        thread.start();
        thread.join();
        System.out.println(Thread.currentThread().getName());
    }
}
