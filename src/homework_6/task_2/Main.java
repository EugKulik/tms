package homework_6.task_2;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.ride();
        car.getTransmission().changeGearUp();
        car.getEngine().stopEngine();
        car.speed();
    }
}