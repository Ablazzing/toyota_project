package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

//Для легковых авто характерно наличие круиз контроля, и возможности включить или выключить его.
public abstract class Sedan extends Car {
    protected boolean isCruiseControlOn;

    public Sedan(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                 double price, GasTank gasTank, Engine engine, Electrics electrics,
                 HeadLigths headLigths, Wheel[] wheels, boolean cruiseControlOn, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels, country);
        isCruiseControlOn = cruiseControlOn;
    }

    public void changeCruiseControl() {
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public boolean isCruiseControlOn() {
        return this.isCruiseControlOn;
    }
}
