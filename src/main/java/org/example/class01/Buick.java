package org.example.class01;

public class Buick implements Car{
    @Override
    public void start() {
        System.out.println("启动");
    }

    @Override
    public void left() {
        System.out.println("左转");

    }

    @Override
    public void right() {
        System.out.println("右转");

    }

    @Override
    public void stop() {
        System.out.println("停止");

    }
}
