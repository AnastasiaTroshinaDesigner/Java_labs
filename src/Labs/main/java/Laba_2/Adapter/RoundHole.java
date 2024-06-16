package Laba_2.Adapter;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundStick stick) {
        return this.getRadius() >= stick.getRadius();
    }
}
