package com.arfront.designpattern.pattern.templatemethod;

public abstract class ACard {

    public final void show() {
        this.create();
        this.share();
    }

    public abstract void create();

    public abstract void share();
}
