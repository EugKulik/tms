package homework_5.task_1;

// этот класс не должен был быть абстрактным
public  class Laptop implements Computer {
    @Override
    public boolean on() {
        return false;
    }

    @Override
    public boolean off() {
        return false;
    }

    @Override
    public boolean reset() {
        return false;
    }
}
