package day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MACButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.WEBButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.type.Button;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MACWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.WEBWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.Window;

public class Web implements GUI {

    private Button webButton;
    private Window webWindow;

    public Web(Button webButton, Window webWindow) {
        this.webButton = webButton;
        this.webWindow = webWindow;
    }

    @Override
    public void showGUI() {
        webWindow.paint();
        webButton.click();
    }

}
