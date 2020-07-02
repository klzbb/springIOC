package org.example.class02.humen;

import org.example.class02.car.Car;

public class ZhanSan extends HumenWithCar{
    public ZhanSan(Car car) {
        super(car);
    }

    public void goHome(){
        car.start();
        car.left();
        car.right();
        car.stop();
    }
}
