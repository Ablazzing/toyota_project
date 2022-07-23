package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

import java.util.Arrays;

public class Camry extends Sedan {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                 GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels,
                 boolean cruiseControlOn, Usb usb, Country country) {
        super(color, maxSpeed, transmission, isMove, price,
                gasTank, engine, electrics, headLigths, wheels, cruiseControlOn, country);
        if (wheels[0].getWheelRadius() != WheelRadius.R17) {
            throw new RuntimeException("Радиус у camry должен быть 17");
        }
        this.usb = usb;
    }


    public Usb getUsb() {
        return usb;
    }


    @Override
    public String toString() {
        return "Camry{" +
                "usb=" + usb +
                ", isCruiseControlOn=" + isCruiseControlOn +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", transmission=" + transmission +
                ", isMove=" + isMove +
                ", price=" + price +
                ", gasTank=" + gasTank +
                ", engine=" + engine +
                ", electrics=" + electrics +
                ", headLigths=" + headLigths +
                ", wheels=" + Arrays.toString(wheels) +
                ", country=" + country +
                '}';
    }
}
