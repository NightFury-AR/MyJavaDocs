package day09.dp_03_decorator_pattern.startbuzz;

import day09.dp_03_decorator_pattern.startbuzz.coffees.DarkRoast;
import day09.dp_03_decorator_pattern.startbuzz.coffees.Espresso;
import day09.dp_03_decorator_pattern.startbuzz.condiments.Mocha;
import day09.dp_03_decorator_pattern.startbuzz.condiments.Soy;

public class OrderCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        //else we can put like this
        Beverage darkRoastWithCondiments = new Soy(new Mocha(new DarkRoast()));
        System.out.println(darkRoast.getDescription() + " :$ "+darkRoast.cost());
        System.out.println(darkRoastWithCondiments.getDescription() + " :$ "+darkRoastWithCondiments.cost());
    }

}
