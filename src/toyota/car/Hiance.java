package toyota.car;

import toyota.car.details.*;

public class Hiance extends CarVagan {
    private Wheel safeWheel;

    public Hiance(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths,
                  Wheel[] wheels, int maxWeight, Wheel safeWheel) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels, maxWeight);
        this.safeWheel = safeWheel;
    }

    public Wheel getSafeWheel() {
        return safeWheel;
    }
}
