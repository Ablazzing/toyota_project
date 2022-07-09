package toyota.car;

import toyota.car.details.*;

public abstract class Car {
    private String color;
    private int maxSpeed;
    private TransmissionType transmission;
    private boolean isMove;
    private double price;

    private GasTank gasTank;
    private Engine engine;
    private Electrics electrics;
    private HeadLigths headLigths;
    private Wheel[] wheels;

    public Car(String color, int maxSpeed, TransmissionType transmission, boolean isMove, double price,
               GasTank gasTank, Engine engine, Electrics electrics, HeadLigths headLigths, Wheel[] wheels) {
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
}
