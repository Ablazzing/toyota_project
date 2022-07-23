package toyota.factory;

import toyota.car.Camry;
import toyota.car.Dyna;
import toyota.car.Hiance;
import toyota.car.Solara;
import toyota.car.details.Electrics;
import toyota.car.details.Engine;
import toyota.car.details.GasTank;
import toyota.car.details.HeadLigths;
import toyota.car.details.MiniFrigde;
import toyota.car.details.Socket;
import toyota.car.details.TransmissionType;
import toyota.car.details.Usb;
import toyota.car.details.Wheel;
import toyota.car.details.WheelRadius;

import java.util.concurrent.Callable;

public class AssemblyCar {
    private Country country;
    private DetailsFactory detailsFactory;

    public AssemblyCar(Country country, DetailsFactory detailsFactory) throws CountyFactoryNotEqualException {
        if (country != detailsFactory.getCountry()) {
            throw new CountyFactoryNotEqualException("Ошибка: Фабрика находится в стране " + detailsFactory.getCountry()
                + " а сборочный конвеер в " + country);
        }
        this.country = country;
        this.detailsFactory = detailsFactory;
    }

    public Camry createCamry(String color, double price) {
        Electrics electrics = detailsFactory.createElectrics();
        Engine engine = detailsFactory.createEngine();
        GasTank gasTank = detailsFactory.createGasTank();
        HeadLigths headLights = detailsFactory.createHeadLights();

        Wheel[] wheels = detailsFactory.createWheels(WheelRadius.R17);
        Usb usb = detailsFactory.createUsb();

        return new Camry(color, 250, TransmissionType.AUTOMATIC, false, price, gasTank, engine,
                electrics, headLights, wheels, false, usb, country);
    }

    public Solara createSolara(String color, double price) {
        Electrics electrics = detailsFactory.createElectrics();
        Engine engine = detailsFactory.createEngine();
        GasTank gasTank = detailsFactory.createGasTank();
        HeadLigths headLights = detailsFactory.createHeadLights();

        Wheel[] wheels = detailsFactory.createWheels(WheelRadius.R16);
        MiniFrigde miniFridge = detailsFactory.createMiniFridge();

        return new Solara(color, 300, TransmissionType.AUTOMATIC, false, price, gasTank, engine,
                electrics, headLights, wheels, false, miniFridge, country);
    }

    public Dyna createDyna(String color, double price) {
        Electrics electrics = detailsFactory.createElectrics();
        Engine engine = detailsFactory.createEngine();
        GasTank gasTank = detailsFactory.createGasTank();
        HeadLigths headLights = detailsFactory.createHeadLights();

        Wheel[] wheels = detailsFactory.createWheels(WheelRadius.R20);
        Socket socket = new Socket();

        return new Dyna(color, 100, TransmissionType.MECHANIC, false, price, gasTank, engine,
                electrics, headLights, wheels, 1000,  socket, country);
    }

    public Hiance createHiance(String color, double price) {
        Electrics electrics = detailsFactory.createElectrics();
        Engine engine = detailsFactory.createEngine();
        GasTank gasTank = detailsFactory.createGasTank();
        HeadLigths headLights = detailsFactory.createHeadLights();

        Wheel[] wheels = detailsFactory.createWheels(WheelRadius.R20);
        Wheel safeWheel = detailsFactory.createSafeWheel(WheelRadius.R20);

        return new Hiance(color, 100, TransmissionType.MECHANIC, false, price, gasTank, engine,
                electrics, headLights, wheels, 1200, safeWheel, country);
    }

}
