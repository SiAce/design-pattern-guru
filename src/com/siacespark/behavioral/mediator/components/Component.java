package com.siacespark.behavioral.mediator.components;

import com.siacespark.behavioral.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
