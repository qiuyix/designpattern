package com.arfront.designpattern.principle.liskovsubstitution;


public class Square extends Rectangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }
}
