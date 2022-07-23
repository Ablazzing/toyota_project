package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

public abstract class Cabriolet extends Car {
    private boolean isRoofUp;

    public Cabriolet(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                     double price, GasTank gasTank, Engine engine, Electrics electrics,
                     HeadLigths headLigths, Wheel[] wheels, boolean isRoofUp, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels, country);
        this.isRoofUp = isRoofUp;
    }

    public void changeRoofStatus() {
        this.isRoofUp = !this.isRoofUp;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }
}
