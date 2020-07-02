package org.example.class02.humen;

import org.example.class02.car.Car;

public class Lisi extends HumenWithCar{
    public Lisi(Car car) {
        super(car);
    }

    public void goHome(){
        car.start();
        car.stop();
    }
}
