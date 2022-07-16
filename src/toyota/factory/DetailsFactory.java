package toyota.factory;

import toyota.car.details.Electrics;
import toyota.car.details.Engine;
import toyota.car.details.GasTank;
import toyota.car.details.HeadLigths;
import toyota.car.details.MiniFrigde;
import toyota.car.details.Socket;
import toyota.car.details.Usb;
import toyota.car.details.Wheel;
import toyota.car.details.WheelRadius;

public class DetailsFactory {
    private Country country;

    public DetailsFactory(Country country) {
        this.country = country;
    }

    public Electrics createElectrics() {
        return new Electrics(false);
    }

    public Engine createEngine() {
        return new Engine(false);
    }

    public GasTank createGasTank() {
        return new GasTank(0);
    }

    public HeadLigths createHeadLights() {
        return new HeadLigths(false);
    }

    public MiniFrigde createMiniFridge() {
        return new MiniFrigde();
    }

    public Socket createSocket() {
        return new Socket();
    }

    public Usb createUsb() {
        return new Usb();
    }

    public Wheel[] createWheels(WheelRadius wheelRadius) {
        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(false, wheelRadius);
        }
        return wheels;
    }

    public Wheel createSafeWheel(WheelRadius wheelRadius) {
        return new Wheel(false, wheelRadius);
    }

    public Country getCountry() {
        return country;
    }
}
