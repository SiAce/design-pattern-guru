package com.siacespark.creational.factory_method;

import com.siacespark.creational.factory_method.factory.Dialog;
import com.siacespark.creational.factory_method.factory.HtmlDialog;
import com.siacespark.creational.factory_method.factory.WindowsDialog;

public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
