package com.siacespark.creational.abstract_factory.app;

import com.siacespark.creational.abstract_factory.buttons.Button;
import com.siacespark.creational.abstract_factory.checkboxes.Checkbox;
import com.siacespark.creational.abstract_factory.factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
