package day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.Window;

public class WEBWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("window: "+title);
    }

    @Override
    public void paint() {
        System.out.println("painting web");
    }
}
