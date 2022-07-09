package toyota;

import toyota.car.Camry;
import toyota.car.StartCarException;
import toyota.car.details.*;

public class Runner {

    public static void main(String[] args) throws StartCarException {
        GasTank gasTank = new GasTank(0);
        Engine engine = new Engine(true);
        Electrics electrics = new Electrics(true);
        HeadLigths headLigths = new HeadLigths(true);

        Camry camry = new Camry("black", 100, TransmissionType.AUTOMATIC, false, 10000.00,
                gasTank, engine, electrics, headLigths, createWheelsWithRadius(WheelRadius.R17),
                false, new Usb());

        camry.start();
    }

    public static Wheel[] createWheelsWithRadius(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }
}
