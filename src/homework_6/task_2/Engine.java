package homework_6.task_2;

public class Engine {
    private boolean engineWorks = false; // это поле по умолчанию будет инициализировано в false

    // методы типа get/set обычно пишут после других, но перед equals/hashcode
    public boolean isEngineWorks() {
        return engineWorks;
    }

    public void startEngine() {
        // if (!engineWorks) {
        if (engineWorks == false) {
            engineWorks = true;
            System.out.println("Engine starting");
        } else {
            System.out.println("Tr-r-r-r - this is the sound from under the hood. The engine have been running already!!!");
        }
    }

    void stopEngine() {
        // if (engineWorks) {
        if (engineWorks == true) {
            engineWorks = false;
            System.out.println("The engine is jammed");
        } else {
            System.out.println("The engine have been jammed already!!!");
        }
    }

//  пустая строка не нужна
}
