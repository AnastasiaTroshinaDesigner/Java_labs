package Laba_1.Construction;

public class Engine {
    private double volume;
    private int mileage;

    public Engine(double volume, int mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", mileage=" + mileage +
                '}';
    }
}
