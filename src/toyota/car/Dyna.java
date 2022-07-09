package toyota.car;

import toyota.car.details.*;

public class Dyna extends CarVagan {
    private Socket socket;

    public Dyna(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels, int maxWeight, Socket socket) {
        super(color, maxSpeed, transmission, isMove, price, gasTank, engine, electrics, headLigths, wheels, maxWeight);
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }
}
