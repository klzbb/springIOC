package org.example.class02.car;

public class Audi implements Car{
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void left() {
        System.out.println("left");

    }

    @Override
    public void right() {
        System.out.println("right");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }
}
