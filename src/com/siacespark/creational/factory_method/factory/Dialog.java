package com.siacespark.creational.factory_method.factory;

import com.siacespark.creational.factory_method.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
