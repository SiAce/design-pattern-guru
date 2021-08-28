package com.siacespark.creational.factory_method.buttons;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Windows Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Windows Button");
    }
}
