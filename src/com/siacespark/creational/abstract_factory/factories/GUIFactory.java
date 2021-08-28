package com.siacespark.creational.abstract_factory.factories;

import com.siacespark.creational.abstract_factory.buttons.Button;
import com.siacespark.creational.abstract_factory.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
