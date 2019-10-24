package homework_6.task_2;

public class Transmission {
    private int numberOfGear;
    private int GEARS_TRANSMISSION = 7;

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void changeGearUp() {

        if (numberOfGear < GEARS_TRANSMISSION) {
            numberOfGear++;
        }
        if (numberOfGear == GEARS_TRANSMISSION) System.out.println("Take it easy! The transmission has 7 gears");
    }

    void changeGearDown() {
        if (numberOfGear == 0) {
            System.out.println("neutral position");
        } else {
            numberOfGear--;
        }
    }


}
