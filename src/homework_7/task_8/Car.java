package homework_7.task_8;

public class Car {
    private MarkerEngine markerEngine;

    public Car(MarkerEngine markerEngine) {
        this.markerEngine = markerEngine;
    }

    public MarkerEngine getMarkerEngine() {
        return markerEngine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "markerEngine=" + markerEngine +
                '}';
    }
}
