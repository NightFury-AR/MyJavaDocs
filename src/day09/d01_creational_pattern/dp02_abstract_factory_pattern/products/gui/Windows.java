package day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MACButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MSButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.type.Button;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MACWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MSWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.Window;

public class Windows implements GUI {

    private Button winButton;
    private Window winWindow;

    public Windows(Button winButton, Window winWindow) {
        this.winButton = winButton;
        this.winWindow = winWindow;
    }

    @Override
    public void showGUI() {
        winWindow.paint();
        winButton.click();
    }

}
