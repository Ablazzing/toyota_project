package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

public class Hiance extends CarVagan {
    private Wheel safeWheel;

    public Hiance(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths,
                  Wheel[] wheels, int maxWeight, Wheel safeWheel, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels,
                maxWeight, country);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }
}
