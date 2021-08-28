package com.siacespark.behavioral.visitor.visitor;

import com.siacespark.behavioral.visitor.shapes.Circle;
import com.siacespark.behavioral.visitor.shapes.CompoundShape;
import com.siacespark.behavioral.visitor.shapes.Dot;
import com.siacespark.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
