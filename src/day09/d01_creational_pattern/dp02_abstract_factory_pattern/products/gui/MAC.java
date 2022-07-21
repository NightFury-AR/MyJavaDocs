package day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MACButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MSButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.type.Button;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MACWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MSWindow;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.Window;

public class MAC implements GUI {

    private Button macButton;
    private Window macWindow;

    public MAC(Button macButton, Window macWindow) {
        this.macButton = macButton;
        this.macWindow = macWindow;
    }

    @Override
    public void showGUI() {
        System.out.println("Hello");
        macWindow.paint();
        macButton.click();
    }
}
