package day09.d01_creational_pattern.dp02_abstract_factory_pattern;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories.GUIFactory;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;

public class GUIFactoryProvider {
    public static GUI buildGUI(GUIFactory guiFactory) {
        GUI gui = guiFactory.createGUI();
        return gui;
    }
}
