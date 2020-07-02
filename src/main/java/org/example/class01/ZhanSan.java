package org.example.class01;

// ioc容器第一课
public class ZhanSan {

    private Car car;
    public ZhanSan(Car car) {
        this.car = car;
    }

    public void goHome(){
        car.start();
        car.left();
        car.right();
        car.stop();
    }
    public void goShop(){
        car.start();
        car.left();
        car.right();
        car.stop();
    }
}
