package Laba_1.Construction;

class BuilderService {
        public void exec() {
            CarBuilder builder = new CarBuilder();
            builder.setCarType (CarType.SPORTS_CAR);
            builder.setSeats(2);
            builder.setEngine(new Engine( 3.0, 0));
            builder.setTransmission (Transmission.SEMI_AUTOMATIC);
            builder.setTripComputer (new TripComputer());
            builder.setGPSNavigator (new GPSNavigator());
            Car car = builder.getResult();
            //System.out.println("Car built:\n" + car.getCarType());
            System.out.println(car.toString());
            CarBuilder builder1 = new CarBuilder();
            builder.setCarType (CarType.CITY_CAR);
            builder.setSeats(2);
            builder.setEngine (new Engine( 3.0, 0)); builder.setTransmission (Transmission.AUTOMATIC);
            builder.setTripComputer (new TripComputer()); builder.setGPSNavigator (new GPSNavigator()); Car car1 = builder.getResult();
            System.out.println(car1.toString());

            CarBuilder builder2 = new CarBuilder();
            builder.setCarType (CarType.SUV);
            builder.setSeats(2);
            builder.setEngine (new Engine( 3.0, 0));
            builder.setTransmission (Transmission.SINGLE_SPEED);
            builder.setTripComputer (new TripComputer());
            builder.setGPSNavigator (new GPSNavigator()); Car car2 = builder.getResult();
            System.out.println(car2.toString());
        }
}
