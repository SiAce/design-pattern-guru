package com.siacespark.creational.builder.director;

import com.siacespark.creational.builder.builders.Builder;
import com.siacespark.creational.builder.cars.CarType;
import com.siacespark.creational.builder.components.Engine;
import com.siacespark.creational.builder.components.GPSNavigator;
import com.siacespark.creational.builder.components.Transmission;
import com.siacespark.creational.builder.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGpsNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGpsNavigator(new GPSNavigator());
    }
}
