package homework_17.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Warehouse {
    private List<String> rack = new ArrayList<>();

    private ReentrantLock reentrantLock = new ReentrantLock();

    public List<String> getRack() {
        return rack;
    }

    public void fell(String box) {
        try {
            boolean lock = reentrantLock.tryLock(Integer.valueOf(box), TimeUnit.MILLISECONDS);
            if (lock){
                rack.add(box);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }
}

