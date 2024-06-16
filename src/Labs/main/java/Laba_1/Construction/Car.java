package Laba_1.Construction;

public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission, TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    @Override
    public String toString() {
        return "CarType: " + carType +
                " Seats: " + seats +
                " Engine: " + engine +
                " Transmission: " + transmission +
                " TripComputer: " + tripComputer +
                " GPSNavigator: " + gpsNavigator;
    }
}
