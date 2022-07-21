package day09.d01_creational_pattern.dp02_abstract_factory_pattern.factories;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.WEBButton;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.Web;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.gui.types.GUI;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.WEBWindow;

public class WebFactory implements GUIFactory {

    @Override
    public GUI createGUI() {
        return new Web(new WEBButton(),new WEBWindow());
    }

}
