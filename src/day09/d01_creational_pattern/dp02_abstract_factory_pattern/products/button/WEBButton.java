package day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button;

import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.button.type.Button;
import day09.d01_creational_pattern.dp02_abstract_factory_pattern.products.window.type.Window;

public class WEBButton implements Button {

    @Override
    public void setTitle(String title) {
        System.out.println("button: "+title);
    }

    @Override
    public void click() {
        System.out.println("clicking web");
    }
}
