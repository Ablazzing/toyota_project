package toyota.car.details;

public abstract class CarDetailBroken {
    private boolean isBroken;

    public CarDetailBroken(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
