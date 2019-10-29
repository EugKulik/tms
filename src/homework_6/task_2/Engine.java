package homework_6.task_2;

public class Engine {
    private boolean engineWorks;

    public void startEngine() {
        if (!engineWorks) {
            engineWorks = true;
            System.out.println("Engine starting");
        } else {
            System.out.println("Tr-r-r-r - this is the sound from under the hood. The engine have been running already!!!");
        }
    }

    void stopEngine() {
        if (engineWorks) {
            engineWorks = false;
            System.out.println("The engine is jammed");
        } else {
            System.out.println("The engine have been jammed already!!!");
        }
    }

    // методы типа get/set обычно пишут после других, но перед equals/hashcode
    public boolean isEngineWorks() {
        return engineWorks;
    }
}
