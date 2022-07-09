package toyota.car;

import toyota.car.details.*;

//Для легковых авто характерно наличие круиз контроля, и возможности включить или выключить его.
public abstract class Sedan extends Car {
    private boolean isCruiseControlOn;

    public Sedan(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                 double price, GasTank gasTank, Engine engine, Electrics electrics,
                 HeadLigths headLigths, Wheel[] wheels, boolean cruiseControlOn) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels);
        isCruiseControlOn = cruiseControlOn;
    }

    public void changeCruiseControl() {
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public boolean isCruiseControlOn() {
        return this.isCruiseControlOn;
    }
}
