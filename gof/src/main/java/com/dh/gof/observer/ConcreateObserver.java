package com.dh.gof.observer;

public class ConcreateObserver implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("A1-接收到信息，并开始处理");
    }
}
