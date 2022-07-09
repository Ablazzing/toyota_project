package toyota.car;

import toyota.car.details.*;

public abstract class CarVagan extends Car {
    private int maxWeight;

    public CarVagan(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                    GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths,
                    Wheel[] wheels, int maxWeight) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
