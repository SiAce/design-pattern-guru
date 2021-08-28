package com.siacespark.creational.builder.builders;

import com.siacespark.creational.builder.cars.CarType;
import com.siacespark.creational.builder.components.Engine;
import com.siacespark.creational.builder.components.GPSNavigator;
import com.siacespark.creational.builder.components.Transmission;
import com.siacespark.creational.builder.components.TripComputer;

public interface Builder {
    public void setCarType(CarType carType);

    public void setSeats(int seats);

    public void setEngine(Engine engine);

    public void setTransmission(Transmission transmission);

    public void setTripComputer(TripComputer tripComputer);

    public void setGpsNavigator(GPSNavigator gpsNavigator);
}
