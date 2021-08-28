package com.siacespark.creational.prototype.shapes;

public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Rectangle) || !super.equals(obj)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.width == width && rectangle.height == height;
    }
}
