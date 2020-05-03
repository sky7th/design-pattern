package com.sky7th.designpattern.decorator.display;

public abstract class DisplayDecorator extends Display {
    private Display decoratedDisplay;

    DisplayDecorator(Display decoratedDisplay) {
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
