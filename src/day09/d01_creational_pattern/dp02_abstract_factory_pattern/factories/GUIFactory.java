package day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.WindowType;

public interface GUIFactory {
    GUI createGUI();
}
