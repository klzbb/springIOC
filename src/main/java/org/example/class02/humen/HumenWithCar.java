package org.example.class02.humen;

import org.example.class02.car.Car;

public abstract class HumenWithCar implements Humen{
    protected Car car;

    public HumenWithCar(Car car) {
        this.car = car;
    }

    public abstract void goHome();
}
