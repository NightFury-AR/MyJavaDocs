package day09.dp_03_decorator_pattern.startbuzz.coffees;

import day09.dp_03_decorator_pattern.startbuzz.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
