package com.siacespark.behavioral.visitor.shapes;

import com.siacespark.behavioral.visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
