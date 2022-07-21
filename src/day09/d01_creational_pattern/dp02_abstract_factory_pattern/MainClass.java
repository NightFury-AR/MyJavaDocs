package day09.d01_creational_pattern.dp02_abstract_factory_pattern;


import day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories.GUIFactory;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories.MACFactory;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;

public class MainClass {
    public static void main(String[] args) {
        GUIFactory guiFactory = new MACFactory();
        GUI macGui = GUIFactoryProvider.buildGUI(guiFactory);
        macGui.showGUI();
    }
}
