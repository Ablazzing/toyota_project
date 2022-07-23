package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

public abstract class CarVagan extends Car {
    private int maxWeight;

    public CarVagan(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                    GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths,
                    Wheel[] wheels, int maxWeight, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels, country );
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
