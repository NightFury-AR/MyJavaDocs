package day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.MACButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.MAC;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.MACWindow;

public class MACFactory implements GUIFactory{

    @Override
    public GUI createGUI() {
        return new MAC(new MACButton(),new MACWindow());
    }
}
