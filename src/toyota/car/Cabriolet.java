package toyota.car;

import toyota.car.Car;
import toyota.car.details.*;

public abstract class Cabriolet extends Car {
    private boolean isRoofUp;

    public Cabriolet(String color, int maxSpeed, TransmissionType transmission, boolean isMove,
                     double price, GasTank gasTank, Engine engine, Electrics electrics,
                     HeadLigths headLigths, Wheel[] wheels, boolean isRoofUp) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels);
        this.isRoofUp = isRoofUp;
    }

    public void changeRoofStatus() {
        this.isRoofUp = !this.isRoofUp;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }
}
