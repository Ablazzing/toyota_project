package toyota.car;

import toyota.car.details.*;
import toyota.factory.Country;

import java.util.Arrays;

public abstract class Car {
    protected String color;
    protected int maxSpeed;
    protected TransmissionType transmission;
    protected boolean isMove;
    protected double price;

    protected GasTank gasTank;
    protected Engine engine;
    protected Electrics electrics;
    protected HeadLigths headLigths;
    protected Wheel[] wheels;
    protected Country country;

    public Car(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
               GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels,
               Country country) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.isMove = isMove;
        this.price = price;
        this.gasTank = gasTank;
        this.engine = engine;
        this.electrics = electrics;
        this.headLigths = headLigths;
        this.wheels = wheels;
        this.country = country;
    }

    public void start() throws StartCarException {
        if (!checkWheels()) {
            throw new StartCarException("С колесами проблема");
        } else if (gasTank.getCurrentVolume() <= 0) {
            throw new StartCarException("Бензобак пустой");
        } else if (engine.isBroken()) {
            throw new StartCarException("Двигатель сломан");
        } else if (electrics.isBroken()) {
            throw new StartCarException("Электрика сломана");
        } else if (headLigths.isBroken()) {
            throw new StartCarException("Фары сломаны");
        }

        this.isMove = true;
    }

    public void stop() {
        this.isMove = false;
    }

    public void onHeadligths() {
        if (!headLigths.isBroken()) {
            System.out.println("Включаем фары");
        }
    }

    public void checkCarHealth() {
        String result = "";
        if (!checkWheels()) {
            result += "С колесами проблема ";
        }
        if (gasTank.getCurrentVolume() <= 0) {
            result += "Бензобак пустой ";
        }
        if (engine.isBroken()) {
            result += "Двигатель сломан ";
        }
        if (electrics.isBroken()) {
            result += "Электрика сломана ";
        }
        if (headLigths.isBroken()) {
            result += "Фары сломаны ";
        }
        if (!result.equals("")) {
            throw new RuntimeException(result);
        }
    }

    public boolean checkWheels() {
        if (wheels == null) {
            return false;
        } else if (wheels.length != 4) {
            return false;
        }


        for (Wheel wheel : wheels) {
            if (wheel.isBroken()) {
                return false;
            }

        }
        return true;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
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
