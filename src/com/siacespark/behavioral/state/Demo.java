package com.siacespark.behavioral.state;

import com.siacespark.behavioral.state.ui.Player;
import com.siacespark.behavioral.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
