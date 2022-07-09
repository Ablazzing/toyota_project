package toyota.car;

import toyota.car.details.*;

public class Camry extends Sedan {
    private Usb usb;

    public Camry(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
                 GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels,
                 boolean cruiseControlOn, Usb usb) {
        super(color, maxSpeed, transmission, isMove, price,
                gasTank, engine, electrics, headLigths, wheels, cruiseControlOn);
        if (wheels[0].getWheelRadius() != WheelRadius.R17) {
            throw new RuntimeException("Радиус у camry должен быть 17");
        }
        this.usb = usb;
    }


    public Usb getUsb() {
        return usb;
    }
}
