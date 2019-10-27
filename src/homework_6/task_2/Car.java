package homework_6.task_2;

/*
* Есть класс автомобиль. У автомобиля есть коробка передач и  мотор.
У мотора должны быть методы “заглушить мотор” и “завести мотор”.
Если попробовать завести работающий мотор, то вывести на экран, что мотор уже работает.
Если заглушить не работающий мотор, то вывести на экран, что мотор уже заглушен

У коробки передач должны быть методы “переключить передачу выше” и “переключить передачу ниже”.
Нельзя понизить передачу ниже 0 и повысить больше 7.

Машина должна уметь ездить, т.е. надо завести мотор, включить первую передачу и нажать газ.
Машина не может поехать, если не заведен мотор.
Когда машина едет, то пускай выведет на экран текущую скорость

Скорость = текущая_передача * 20

P.S. имена методов условные, ваши могут отличаться в названии.
Помните, что поля класса должны быть приватными*/
public class Car {
    private Transmission transmission;
    private Engine engine;
    private boolean carRide = false; // можно не писать false, это будет по умолчанию
    private boolean gasPedal = false; // можно не писать false, это будет по умолчанию

    // Transmission, Engine аргументами в конструктор
    public Car() {
        this.transmission = new Transmission();
        this.engine = new Engine();
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void ride() {
        // carRide == true -> carRdide - 
        // if (getEngine().isEngineWorks() && carRide) {
        if (getEngine().isEngineWorks() && carRide == false) {
            carRide = true;
            engine.startEngine();
            transmission.changeGearUp();
            gasPedal();
            speed();
        }
        return;
    }

    public void gasPedal() {
        gasPedal = true;
        System.out.println("Gas pedal depressed");
    }

    public void speed() {
//        if (carRide) {
        if (carRide == true) {
            System.out.println("Car speed = " + getTransmission().getNumberOfGear() * 20);
        } else System.out.println("Car speed = 0"); // else {}
    }
}
