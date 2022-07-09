package toyota.car.details;

public class Wheel extends CarDetailBroken {
    private WheelRadius wheelRadius;

    public Wheel(boolean isBroken, WheelRadius wheelRadius) {
        super(isBroken);
        this.wheelRadius = wheelRadius;
    }

    public WheelRadius getWheelRadius() {
        return wheelRadius;
    }
}
