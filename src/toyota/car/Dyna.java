package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

public class Dyna extends CarVagan {
    private Socket socket;

    public Dyna(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels,
                int maxWeight, Socket socket, Country country) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels,
                maxWeight, country);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}
