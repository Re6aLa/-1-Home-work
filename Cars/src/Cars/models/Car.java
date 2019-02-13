package Cars.models;

import Cars.parts.Engine;

/**
 *
 * @author Kristev
 */
public class Car {

    int numberOfWheels;
    int numberOfDoors;
    float engineCapacity;
    Engine engine;
    String name;
    String subModel;

    boolean isStarted = false;

    void startEngine() {
        isStarted = true;
    }

    void run() {
        consumeFuel();
    }

    void consumeFuel() {
    }

    public void present() {
        System.out.println("Info: Name" + name + "subModel: " + subModel
                + "Wheels: " + numberOfWheels + "Doors: " + numberOfDoors);
    }
}
