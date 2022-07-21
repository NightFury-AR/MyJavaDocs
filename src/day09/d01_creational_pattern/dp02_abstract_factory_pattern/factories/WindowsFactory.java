package day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MSButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.Windows;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MSWindow;

public class WindowsFactory implements GUIFactory {
    @Override
    public GUI createGUI() {
        return new Windows(new MSButton(),new MSWindow());
    }
}
