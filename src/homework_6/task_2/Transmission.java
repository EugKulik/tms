package homework_6.task_2;

public class Transmission {
    private int numberOfGear;
    // private static final int GEARS_TRANSMISSION = 7; 
    private int GEARS_TRANSMISSION = 7;

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void changeGearUp() {
// пустая строка не нужна
        if (numberOfGear < GEARS_TRANSMISSION) {
            numberOfGear++;
        }
        // if (numberOfGear == GEARS_TRANSMISSION) {} - лучше использовать всегда, думаю этот код можно было поместить в else {} от первого if()
        if (numberOfGear == GEARS_TRANSMISSION) System.out.println("Take it easy! The transmission has 7 gears");
    }

    void changeGearDown() {
        if (numberOfGear == 0) {
            System.out.println("neutral position");
        } else {
            numberOfGear--;
        }
    }

// пустая строка не нужна
}
