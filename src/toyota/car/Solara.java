package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

public class Solara extends Cabriolet {
    private MiniFrigde miniFrigde;

    public Solara(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                  GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths,
                  Wheel[] wheels, boolean isRoofUp, MiniFrigde miniFrigde, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels,
                isRoofUp, country);
        this.miniFrigde = miniFrigde;
    }

    public MiniFrigde getMiniFrigde() {
        return miniFrigde;
    }
}
