package toyota.car.details;

public class GasTank {
    private double currentVolume;

    public GasTank(double currentVolume) {
        this.currentVolume = currentVolume;
    }

    public double getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(double currentVolume) {
        this.currentVolume = currentVolume;
    }
}
